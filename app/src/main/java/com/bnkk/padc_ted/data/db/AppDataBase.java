package com.bnkk.padc_ted.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.bnkk.padc_ted.data.vos.PodcastsVO;
import com.bnkk.padc_ted.data.vos.ResultsVO;
import com.bnkk.padc_ted.data.vos.SegmentsVO;
import com.bnkk.padc_ted.data.vos.SpeakerVO;
import com.bnkk.padc_ted.data.vos.TEDPlayListsVO;
import com.bnkk.padc_ted.data.vos.TEDTalksVO;
import com.bnkk.padc_ted.data.vos.TagVO;

/**
 * Created by E5-575G on 2/6/2018.
 */

@Database(entities = {PodcastsVO.class, ResultsVO.class, SegmentsVO.class, SpeakerVO.class
        , TagVO.class, TEDPlayListsVO.class, TEDTalksVO.class}
        , version = 1)
public abstract class AppDataBase extends RoomDatabase {

    private static final String DB_NAME = "PADC-TED-.DB";

    private static AppDataBase INSTANCE;

    public static AppDataBase getInMemoryDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context, AppDataBase.class, DB_NAME)
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
