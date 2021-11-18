package com.sample;




import java.util.Set;


public class Server {


    public String name;
    public int processors;
    public int memory;
    public int diskspace;
    public boolean isValid=true;
    public Set<String> fired;

    public Server(String name, int processors, int memory, int diskspace,Set<String> set) {
        this.name = name;
        this.processors = processors;
        this.memory = memory;
        this.diskspace = diskspace;
        this.fired = set;
    }


    public Set<String> getFired() {
        return fired;
    }

    public void setFired(Set<String> fired) {
        this.fired = fired;
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