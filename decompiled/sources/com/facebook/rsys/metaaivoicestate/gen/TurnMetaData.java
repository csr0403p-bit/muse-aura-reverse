package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class TurnMetaData {
    public static G50<TurnMetaData> CONVERTER = C8922Fte.A00(4);
    public static long sMcfTypeId;
    public final Long endOfUserSpeechNtp;
    public final String integrityFailure;
    public final Boolean isRambleModeCreateIntentDetected;
    public final ArrayList<String> postIds;
    public final Long startOfUserInterruptNtp;
    public final Long startOfUserSpeechNtp;
    public final String turnUuid;

    public static native TurnMetaData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TurnMetaData) {
                TurnMetaData turnMetaData = (TurnMetaData) obj;
                if (this.turnUuid.equals(turnMetaData.turnUuid)) {
                    Long l = this.startOfUserSpeechNtp;
                    Long l2 = turnMetaData.startOfUserSpeechNtp;
                    if (l != null ? l.equals(l2) : l2 == null) {
                        Long l3 = this.endOfUserSpeechNtp;
                        Long l4 = turnMetaData.endOfUserSpeechNtp;
                        if (l3 == null) {
                            if (l4 != null) {
                                return false;
                            }
                        } else if (l3.equals(l4)) {
                        }
                        String str = this.integrityFailure;
                        String str2 = turnMetaData.integrityFailure;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                        Long l5 = this.startOfUserInterruptNtp;
                        Long l6 = turnMetaData.startOfUserInterruptNtp;
                        if (l5 == null) {
                            if (l6 != null) {
                                return false;
                            }
                        } else if (l5.equals(l6)) {
                        }
                        ArrayList<String> arrayList = this.postIds;
                        ArrayList<String> arrayList2 = turnMetaData.postIds;
                        if (arrayList == null) {
                            if (arrayList2 != null) {
                                return false;
                            }
                        } else if (arrayList.equals(arrayList2)) {
                        }
                        Boolean bool = this.isRambleModeCreateIntentDetected;
                        Boolean bool2 = turnMetaData.isRambleModeCreateIntentDetected;
                        if (bool == null) {
                            if (bool2 != null) {
                                return false;
                            }
                        } else if (bool.equals(bool2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((BV8.A0B(this.turnUuid) + AnonymousClass006.A0D(this.startOfUserSpeechNtp)) * 31) + AnonymousClass006.A0D(this.endOfUserSpeechNtp)) * 31) + AnonymousClass006.A0G(this.integrityFailure)) * 31) + AnonymousClass006.A0D(this.startOfUserInterruptNtp)) * 31) + AnonymousClass006.A0D(this.postIds)) * 31) + C3cH.A02(this.isRambleModeCreateIntentDetected);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("TurnMetaData{turnUuid=");
        sbA0x.append(this.turnUuid);
        sbA0x.append(",startOfUserSpeechNtp=");
        sbA0x.append(this.startOfUserSpeechNtp);
        sbA0x.append(",endOfUserSpeechNtp=");
        sbA0x.append(this.endOfUserSpeechNtp);
        sbA0x.append(",integrityFailure=");
        sbA0x.append(this.integrityFailure);
        sbA0x.append(",startOfUserInterruptNtp=");
        sbA0x.append(this.startOfUserInterruptNtp);
        sbA0x.append(",postIds=");
        sbA0x.append(this.postIds);
        sbA0x.append(",isRambleModeCreateIntentDetected=");
        return BV8.A0v(this.isRambleModeCreateIntentDetected, sbA0x);
    }

    public TurnMetaData(String str, Long l, Long l2, String str2, Long l3, ArrayList<String> arrayList, Boolean bool) {
        str.getClass();
        this.turnUuid = str;
        this.startOfUserSpeechNtp = l;
        this.endOfUserSpeechNtp = l2;
        this.integrityFailure = str2;
        this.startOfUserInterruptNtp = l3;
        this.postIds = arrayList;
        this.isRambleModeCreateIntentDetected = bool;
    }
}
