class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuffer rnaTranscribed;
        rnaTranscribed = new StringBuffer(dnaStrand.length());

        dnaStrand=dnaStrand.toUpperCase();

        for (int i = 0; i<dnaStrand.length();i++){

            if(dnaStrand.charAt(i)=='G') // g-c c-g t-a a-u
                rnaTranscribed.append('C');
            else if(dnaStrand.charAt(i)=='C') // g-c c-g t-a a-u
                rnaTranscribed.append('G');
            else if(dnaStrand.charAt(i)=='T') // g-c c-g t-a a-u
                rnaTranscribed.append('A');
            else if(dnaStrand.charAt(i)=='A') // g-c c-g t-a a-u
                rnaTranscribed.append('U');

        }

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        return rnaTranscribed.toString();
    }

}
