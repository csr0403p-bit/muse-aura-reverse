package com.facebook.tigon.iface;

import X.AIW;
import X.C3608CXf;
import X.C3cF;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TigonErrorCode {
    public static final C3608CXf A00;
    public static final Map<Integer, TigonErrorCode> A01;
    public static final /* synthetic */ Ey9 A02;
    public static final /* synthetic */ TigonErrorCode[] A03;
    public static final TigonErrorCode A04;
    public static final TigonErrorCode A05;
    public static final TigonErrorCode A06;
    public static final TigonErrorCode A07;
    public static final TigonErrorCode A08;
    public final int value;

    static {
        TigonErrorCode tigonErrorCode = new TigonErrorCode(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, 0);
        A07 = tigonErrorCode;
        TigonErrorCode tigonErrorCode2 = new TigonErrorCode("CANCEL", 1, 1);
        A04 = tigonErrorCode2;
        TigonErrorCode tigonErrorCode3 = new TigonErrorCode("TRANSIENT_ERROR", 2, 2);
        A08 = tigonErrorCode3;
        TigonErrorCode tigonErrorCode4 = new TigonErrorCode("FATAL_ERROR", 3, 3);
        A05 = tigonErrorCode4;
        TigonErrorCode tigonErrorCode5 = new TigonErrorCode("INVALID_REQUEST", 4, 4);
        A06 = tigonErrorCode5;
        TigonErrorCode[] tigonErrorCodeArr = {tigonErrorCode, tigonErrorCode2, tigonErrorCode3, tigonErrorCode4, tigonErrorCode5, new TigonErrorCode("REQUEST_NOT_SUPPORTED", 5, 5)};
        A03 = tigonErrorCodeArr;
        A02 = C3cG.A0w(tigonErrorCodeArr);
        A00 = new C3608CXf();
        TigonErrorCode[] tigonErrorCodeArrValues = values();
        int iA0H = AIW.A0H(tigonErrorCodeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA0H < 16 ? 16 : iA0H);
        for (TigonErrorCode tigonErrorCode6 : tigonErrorCodeArrValues) {
            linkedHashMap.put(Integer.valueOf(tigonErrorCode6.value), tigonErrorCode6);
        }
        A01 = linkedHashMap;
    }

    public static final TigonErrorCode fromValue(int i) {
        return A00.fromValue(i);
    }

    public static TigonErrorCode valueOf(String str) {
        return (TigonErrorCode) Enum.valueOf(TigonErrorCode.class, str);
    }

    public static TigonErrorCode[] values() {
        return (TigonErrorCode[]) A03.clone();
    }

    public TigonErrorCode(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 0:
                return "None";
            case 1:
                return "Cancel";
            case 2:
                return "TransientError";
            case 3:
                return "FatalError";
            case 4:
                return C3cF.A00(12);
            case 5:
                return "RequestNotSupported";
            default:
                throw C3cG.A0q();
        }
    }
}
