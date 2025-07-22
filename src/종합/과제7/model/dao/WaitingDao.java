package 종합.과제7.model.dao; // 패키지명

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.과제7.model.dto.WaitingDto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaitingDao { // class start
    // 싱글톤
    private WaitingDao(){ openCSV(); }
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }

    // 리스트 만들기
    ArrayList<WaitingDto> waitingDB = new ArrayList<>();

    // 등록
    public boolean waitAdd(WaitingDto waitingDto){
        waitingDB.add(waitingDto);
        saveCSV();
        return true;
    }// func end

    // 전체조회
    public ArrayList<WaitingDto> waitPrint(){
        return waitingDB;
    }// func end

    // csv파일 경로 지정
    private String path = "src/종합/과제7/data.csv";
    // csv 파일 연동
    public void openCSV(){
        File file = new File(path);
        if (file.exists()){
            loadCSV();
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) { System.out.println(e); } // try end
        }// if end
    }// func end

    // csv 입력(호출)함수
    public void loadCSV(){
        try{
            FileReader fileReader = new FileReader(path);
            CSVReader csvReader = new CSVReader(fileReader);
            List< String[] > inData = csvReader.readAll();
            for (String[] row : inData){
                String phone = row[0];
                int count = Integer.parseInt(row[1]);
                WaitingDto waitingDto = new WaitingDto(phone,count);
                waitingDB.add(waitingDto);
            }// for end
            csvReader.close();
        }catch (Exception e){ System.out.println(e); } // try end
    }// func end

    // csv 출력(저장)함수
    public void saveCSV(){
        try{
            FileWriter fileWriter = new FileWriter(path);
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            List<String[]> outData = new ArrayList<>();
            for (WaitingDto waitingDto : waitingDB){
                String[] row = {waitingDto.getPhone() , String.valueOf(waitingDto.getCount())};
                outData.add(row);
            }// for end
            csvWriter.writeAll(outData);
            csvWriter.close();
        }catch (Exception e){ System.out.println(e); }
    }// func end
}// class end
