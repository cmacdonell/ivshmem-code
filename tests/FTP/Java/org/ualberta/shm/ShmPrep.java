package org.ualberta.shm;

public class ShmPrep {
    public static void main(String[] args) throws Exception {
        int msize = Integer.parseInt(args[1]);
        int nblocks = Integer.parseInt(args[2]);
        int nchunks = Integer.parseInt(args[3]);

        Shm s = new Shm(args[0], msize, nblocks, nchunks);
        s.prep();
    } 
}
