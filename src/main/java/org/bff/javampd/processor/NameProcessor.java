package org.bff.javampd.processor;

import org.bff.javampd.song.MPDSong;

public class NameProcessor extends SongResponseProcessor {

    public NameProcessor() {
        super("Name:");
    }

    @Override
    public void processSong(MPDSong song, String line) {
        if (startsWith(line)) {
            song.setName(line.substring(getPrefix().length()).trim());
        }
    }
}
