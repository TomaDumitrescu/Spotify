package app.pages;

import app.audio.Collections.Playlist;
import app.audio.Files.Song;

import java.util.List;

/**
 * The type Liked content page.
 */
public final class LikedContentPage implements Page {
    /**
     * The Liked songs.
     */
    private List<Song> likedSongs;
    /**
     * The Followed playlists.
     */
    private List<Playlist> followedPlaylists;

    /**
     * Instantiates a new Liked content page.
     *
     * @param songs the songs
     * @param playlists the playlists
     */
    public LikedContentPage(final List<Song> songs,
                            final List<Playlist> playlists) {
        likedSongs = songs;
        followedPlaylists = playlists;
    }

    @Override
    public String printCurrentPage() {
        return "Liked songs:\n\t%s\n\nFollowed playlists:\n\t%s"
               .formatted(likedSongs.stream().map(song -> "%s - %s"
                          .formatted(song.getName(), song.getArtist())).toList(),
                          followedPlaylists.stream().map(playlist -> "%s - %s"
                          .formatted(playlist.getName(), playlist.getOwner())).toList());
    }
}
