package com.zvyap.dailycheckin.test;

import com.zvyap.dailycheckin.CheckInAction;
import com.zvyap.dailycheckin.HoyoDaily;
import com.zvyap.dailycheckin.WebhookInfo;
import com.zvyap.hoyoapi.APIEnvironment;
import com.zvyap.hoyoapi.APILocale;
import com.zvyap.hoyoapi.GameType;
import com.zvyap.hoyoapi.HoyoToken;
import com.zvyap.hoyoapi.HoyoverseAPI;
import com.zvyap.hoyoapi.feature.daily.DailyCheckInFeature;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckInDailyTest {

    private final HoyoverseAPI api = new HoyoverseAPI(APIEnvironment.OVERSEA, APILocale.EN_US);
    private final DailyCheckInFeature feature = new DailyCheckInFeature(api);

    @Test
    public void checkIn() {
        HoyoDaily.checkIn(feature, List.of(

                CheckInAction.builder()
                        .token(HoyoToken.of(System.getenv("CHOWWY_ID"), System.getenv("CHOWWY_TOKEN")))
                        .game(GameType.GENSHIN_IMPACT)
                        .build(),
            
                CheckInAction.builder()
                        .token(HoyoToken.of(System.getenv("T_DAT_ID"), System.getenv("T_DAT_TOKEN")))
                        .game(GameType.GENSHIN_IMPACT)
                        .build(),

                CheckInAction.builder()
                        .token(HoyoToken.of(System.getenv("TEI_ID"), System.getenv("TEI_TOKEN")))
                        .game(GameType.GENSHIN_IMPACT)
                        .game(GameType.HONKAI_STAR_RAIL)
                        .build(),
            
                CheckInAction.builder()
                        .token(HoyoToken.of(System.getenv("RIN_ID"), System.getenv("RIN_TOKEN")))
                        .game(GameType.GENSHIN_IMPACT)
                        .build(),
            
                CheckInAction.builder()
                        .token(HoyoToken.of(System.getenv("GRU_ID"), System.getenv("GRU_TOKEN")))
                        .game(GameType.GENSHIN_IMPACT)
                        .build()


        ));
    }

}
