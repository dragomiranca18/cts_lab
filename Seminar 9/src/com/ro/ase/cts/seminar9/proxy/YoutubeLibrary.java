package com.ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface{

	private VideoDatabase videodatabase;
	
	public YoutubeLibrary() {
		this.videodatabase=new VideoDatabase();
	}
	
	@Override
	public String listVideos() {
		System.out.println("Fetching videos from database...");
		ArrayList<YoutubeVideo> videoList=videodatabase.getVideoCollection();
		StringBuilder videoListBuilder=new StringBuilder();
		for(YoutubeVideo video:videoList) {
			videoListBuilder.append(video.getId()).append("-")
			.append(video.getTitle())
			.append("\n");
		}
		return videoListBuilder.toString();
	}

	@Override
	public String getVideoInfo(int id) {
		System.out.println("Fetching video info...");
		return videodatabase.getVideoInfo(id);
	}

}
