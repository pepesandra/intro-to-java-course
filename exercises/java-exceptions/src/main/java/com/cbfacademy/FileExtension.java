package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    public boolean check(String fileName) throws FilenameException{
        if (fileName == null || fileName.isEmpty()){ 
            throw new FilenameException("file is empty");
        }
        
 return fileName.endsWith(".java");


    }
}

//     public Map<String, Integer> map(List<String> filenames){
//        Map<String, Integer> resultMap = new HashMap<>();

//        try{
//         if (check ())
//        }

//     }

// }
