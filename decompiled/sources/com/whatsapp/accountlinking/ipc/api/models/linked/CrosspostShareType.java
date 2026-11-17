package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CrosspostShareType {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ CrosspostShareType[] A01;

    static {
        CrosspostShareType[] crosspostShareTypeArr = {new CrosspostShareType("XPOST_STORY_TO_STATUS", 0), new CrosspostShareType("XPOST_REEL_TO_STATUS", 1), new CrosspostShareType("XPOST_POST_TO_STATUS", 2)};
        A01 = crosspostShareTypeArr;
        A00 = C3cG.A0w(crosspostShareTypeArr);
    }

    public static CrosspostShareType valueOf(String str) {
        return (CrosspostShareType) Enum.valueOf(CrosspostShareType.class, str);
    }

    public static CrosspostShareType[] values() {
        return (CrosspostShareType[]) A01.clone();
    }

    public CrosspostShareType(String str, int i) {
    }
}
