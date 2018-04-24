package com.jeffrey.utils.logger;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class LoggerModule {

    /**
     * module name
     */
    private String moduleName ;

    private String childModule ;

    private LoggerModule moduleCode ;

}
