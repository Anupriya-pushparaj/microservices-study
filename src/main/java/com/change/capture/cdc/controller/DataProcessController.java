package com.change.capture.cdc.controller;


import com.change.capture.cdc.data.ProcessTable;
import com.change.capture.cdc.model.DataProcessRequest;
import com.change.capture.cdc.model.DataProcessResponse;
import com.change.capture.cdc.service.DataProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("dataProcess")
public class DataProcessController {


    @Autowired
    private DataProcessService dataProcessService;

    // Post Mapping
    @PostMapping
    public DataProcessResponse saveProcessedRecords(@RequestBody DataProcessRequest dataProcessRequest) {

        return this.dataProcessService.saveProcessRecords(dataProcessRequest);

    }

    @GetMapping
    public List<ProcessTable> getProcessRecords() {
       return this.dataProcessService.getAllProcessRecords();
    }


}
