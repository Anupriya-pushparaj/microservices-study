package com.change.capture.cdc.service;


import com.change.capture.cdc.data.ProcessTable;
import com.change.capture.cdc.model.DataProcessRequest;
import com.change.capture.cdc.model.DataProcessResponse;
import com.change.capture.cdc.repository.DataProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DataProcessService {



    @Autowired
    private DataProcessRepository dataProcessRepository;

    public DataProcessResponse saveProcessRecords(DataProcessRequest dataProcessRequest) {

        try {
            ProcessTable processTable = new ProcessTable();

            processTable.setID(new Random().nextInt());
            processTable.setProcessName(dataProcessRequest.getProcessName());
            processTable.setProcessIP(dataProcessRequest.getProcessIp());
            processTable.setMacAddress(dataProcessRequest.getMacAddress());
            processTable.setUserName(dataProcessRequest.getUser());

            dataProcessRepository.save(processTable);


            DataProcessResponse dataProcessResponse = new DataProcessResponse();
            dataProcessResponse.setStatus("Success");
            dataProcessResponse.setMessage("Process Data Saved Successfully");
            return dataProcessResponse;

        } catch (Exception e) {
            DataProcessResponse dataProcessResponse = new DataProcessResponse();
            dataProcessResponse.setStatus("Error");
            dataProcessResponse.setMessage(e.getMessage());
            return dataProcessResponse;

        }

    }


    public List<ProcessTable> getAllProcessRecords() {
        return this.dataProcessRepository.findAll();
    }


}
