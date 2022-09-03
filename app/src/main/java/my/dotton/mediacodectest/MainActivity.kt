package my.dotton.mediacodectest

import android.media.MediaCodec
import android.media.MediaExtractor
import android.media.MediaFormat
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var video_15s = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"
    var videos_47s = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
    var video_14m = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        /**
         구현 및 작동 순서
         
         1. MediaExtractor로 비디오파일에서 인코딩된 프레임 추출
         2. MediaCodec으로 프레임 디코딩
         3. OpnGL Es2로 프레임 랜더링
         4. 이미지 랜더링
         5. MediaCodec으로 프레임 다시 인코딩
         6. MediaMuxer를 사용하여 비디오 파일 저장
         */

        var btn_encoding:Button = findViewById(R.id.btn_encoding)

        /** H.264를 뜻하는 "video/avc" */
        var vformat = MediaFormat.createVideoFormat("video/avc",1280,720)

        var codec = MediaCodec.createDecoderByType("video/avc")


        val extractor = MediaExtractor()
        extractor.setDataSource(video_15s)



        btn_encoding.setOnClickListener {
            //TODO 인코딩 버튼


        }
    }
}