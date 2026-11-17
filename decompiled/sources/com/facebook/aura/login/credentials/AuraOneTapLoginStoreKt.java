package com.facebook.aura.login.credentials;

import X.ADq;
import X.AGH;
import X.AbstractC7531Ezs;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BNt;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.HxE;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AuraOneTapLoginStoreKt {
    public static final String KEY_ALIAS = "hatch_one_tap_login_store";
    public static final String KEY_LOGINS = "logins";
    public static final String KEY_VERSION = "version";
    public static final int SCHEMA_VERSION = 1;
    public static final String TAG = "AuraOneTapLoginStore";

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map<String, AuraOneTapLogin> decodeLogins(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int i = dataInputStream.readInt();
            if (i < 0 || i >= 6) {
                throw new IOException(FGI.A0H("Unexpected one-tap login count ", i));
            }
            ADq aDq = new ADq(1, i);
            ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
            Iterator<Integer> it = aDq.iterator();
            while (it.hasNext()) {
                ((BNt) it).A00();
                String utf = dataInputStream.readUTF();
                String utf2 = dataInputStream.readUTF();
                C7384Etj.A0U(utf2);
                String utf3 = dataInputStream.readUTF();
                C7384Etj.A0U(utf3);
                AnonymousClass002.A1J(utf, new AuraOneTapLogin(utf2, utf3), arrayListA0i);
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : arrayListA0i) {
                HxE hxE = (HxE) obj;
                String str = (String) hxE.first;
                AuraOneTapLogin auraOneTapLogin = (AuraOneTapLogin) hxE.second;
                C7384Etj.A0X(str);
                if (!C7BY.A0j(str) && !C7BY.A0j(auraOneTapLogin.savedAccountId)) {
                    AnonymousClass006.A1F(auraOneTapLogin.nonce, obj, arrayListA0h);
                }
            }
            Map<String, AuraOneTapLogin> mapA06 = AGH.A06(arrayListA0h);
            dataInputStream.close();
            return mapA06;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(dataInputStream, th);
                throw th2;
            }
        }
    }

    public static final byte[] encodeLogins(Map<String, AuraOneTapLogin> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(map.size());
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String str = (String) entryA0l.getKey();
                AuraOneTapLogin auraOneTapLogin = (AuraOneTapLogin) entryA0l.getValue();
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeUTF(auraOneTapLogin.savedAccountId);
                dataOutputStream.writeUTF(auraOneTapLogin.nonce);
            }
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C7384Etj.A0U(byteArray);
            return byteArray;
        } finally {
        }
    }
}
