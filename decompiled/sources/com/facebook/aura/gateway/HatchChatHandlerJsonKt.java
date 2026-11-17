package com.facebook.aura.gateway;

import X.AII;
import X.AIM;
import X.AnonymousClass002;
import X.C3cG;
import X.HxE;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;

/* loaded from: classes3.dex */
public abstract class HatchChatHandlerJsonKt {
    public static final HxE<String, Object>[] buildUnreadCountQueryParams(String str) {
        return str != null ? new HxE[]{C3cG.A0r("session_id", str)} : new HxE[0];
    }

    public static final HxE<String, Object>[] buildChatHistoryQueryParams(int i, Long l, String str) {
        AII aiiA17 = AIM.A17();
        if (i < 1) {
            i = 1;
        } else if (i > 200) {
            i = 200;
        }
        AnonymousClass002.A1J(PhotosSearchHandlerKt.PARAM_LIMIT, Integer.valueOf(i), aiiA17);
        if (l != null) {
            AnonymousClass002.A1J("before_seq", l, aiiA17);
        }
        if (str != null) {
            AnonymousClass002.A1J("session_id", str, aiiA17);
        }
        return (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
    }
}
