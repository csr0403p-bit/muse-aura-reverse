package com.facebook.aura.hatchlockcrypto;

import X.ADq;
import X.AnonymousClass003;
import X.BNt;
import X.C3cG;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class HatchPassphraseGenerator {
    public static final char[] ALPHABET;
    public static final int DEFAULT_LENGTH = 32;
    public static final HatchPassphraseGenerator INSTANCE = new HatchPassphraseGenerator();

    static {
        ADq aDq = new ADq(33, 126);
        ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
        Iterator<Integer> it = aDq.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(Character.valueOf((char) ((BNt) it).A00()));
        }
        char[] cArr = new char[arrayListA0i.size()];
        Iterator it2 = arrayListA0i.iterator();
        int i = 0;
        while (it2.hasNext()) {
            cArr[i] = ((Character) it2.next()).charValue();
            i++;
        }
        ALPHABET = cArr;
    }

    public static /* synthetic */ byte[] generate$default(HatchPassphraseGenerator hatchPassphraseGenerator, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 32;
        }
        return hatchPassphraseGenerator.generate(i);
    }

    public final byte[] generate(int i) {
        SecureRandom secureRandom = new SecureRandom();
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr2 = ALPHABET;
            cArr[i2] = cArr2[secureRandom.nextInt(cArr2.length)];
        }
        return C3cG.A1S(new String(cArr));
    }
}
