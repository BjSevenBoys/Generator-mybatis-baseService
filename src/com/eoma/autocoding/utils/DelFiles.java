package com.eoma.autocoding.utils;

import java.io.File;

/**
 * 删除某个目录及目录下的所有子目录和文件
 * @author : harara
 * @version : 2.0
 * @date : 2020/5/19 17:04
 */
public class DelFiles {

    /**
     * 递归删除
     * 删除某个目录及目录下的所有子目录和文件
     * @param file 文件或目录
     * @return 删除结果
     */
    public static boolean delFiles(File file){
        boolean result = false;
        //目录
        if(file.isDirectory()){
            File[] childrenFiles = file.listFiles();
            for (File childFile:childrenFiles){
                result = delFiles(childFile);
                if(!result){
                    return result;
                }
            }
        }
        //删除 文件、空目录
        result = file.delete();
        return result;
    }

    public static void main(String[] args) {
        File file = new File("E:\\temp");
        System.out.println("result："+delFiles(file));
    }

}