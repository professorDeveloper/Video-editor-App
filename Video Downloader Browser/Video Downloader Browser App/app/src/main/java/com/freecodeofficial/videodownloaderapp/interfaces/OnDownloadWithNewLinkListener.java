package com.freecodeofficial.videodownloaderapp.interfaces;

import com.freecodeofficial.videodownloaderapp.helper.DownloadVideo;

//interface created outside DownloadsInactive in a different file to avoid cyclic inheritance
public interface OnDownloadWithNewLinkListener {
    void onDownloadWithNewLink(DownloadVideo download);
}
