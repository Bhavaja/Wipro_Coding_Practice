package oops_package;

public class InterfaceImplementation {

	public static void main(String[] args) {
		
		Playable play_audio = new AudioPlayer();
		Recordable record_audio = new AudioPlayer();
		play_audio.play();
		record_audio.record();
		System.out.println();

		Playable play_video = new VideoPlayer();
		Streamable stream_video = new VideoPlayer();
		play_video.play();
		stream_video.stream();
		System.out.println();
		
		Recordable cam_record = new Camera();
		Streamable stream_live = new Camera();
		cam_record.record();
		stream_live.stream();

	}

}
