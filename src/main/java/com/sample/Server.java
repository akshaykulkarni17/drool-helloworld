package com.sample;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class Server {

    public String name;
    public int processors;
    public int memory;
    public int diskspace;
    public boolean isValid=true;
    public Map<String, Integer> map;

    public Server(String name, int processors, int memory, int diskspace,Map<String, Integer> map) {
        this.name = name;
        this.processors = processors;
        this.memory = memory;
        this.diskspace = diskspace;
        this.map = map;
    }



    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProcessors() {
        return processors;
    }

    public void setProcessors(int processors) {
        this.processors = processors;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiskspace() {
        return diskspace;
    }

    public void setDiskspace(int diskspace) {
        this.diskspace = diskspace;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
// Getter/Setters method omitted for brevity
}