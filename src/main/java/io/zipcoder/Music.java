package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }


    public Integer selection(Integer startIndex, String selection) {
        if(playList[startIndex].equals(selection)) {
            return 0;
        }

        Integer up = startIndex;
        Integer down = startIndex;

        for(int step = 1; step <= playList.length/2; step++) {
            up++;
            down--;

            if(down == -1) {
                down = playList.length-1;
            }
            if(up == playList.length) {
                up =0;
            }
            if(playList[down].equals(selection) || playList[up].equals(selection)) {
                return step;
            }
        }
        return -1;
    }
}