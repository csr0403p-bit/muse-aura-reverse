package com.facebook.aura.devices.pairing;

import X.ADq;
import X.AGH;
import X.AbstractC7531Ezs;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BNt;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
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
public abstract class HatchSavedWifiNetworkStoreKt {
    public static final String KEY_ALIAS = "hatch_saved_wifi_networks";
    public static final String KEY_NETWORKS = "networks";
    public static final String KEY_VERSION = "version";
    public static final int MAX_SAVED_NETWORKS = 32;
    public static final int SCHEMA_VERSION = 1;
    public static final String TAG = "HatchSavedWifiNetworkStore";

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map<String, String> decodeNetworks(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int i = dataInputStream.readInt();
            if (i < 0 || i >= 33) {
                throw new IOException(FGI.A0H("Unexpected saved network count ", i));
            }
            ADq aDq = new ADq(1, i);
            ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
            Iterator<Integer> it = aDq.iterator();
            while (it.hasNext()) {
                ((BNt) it).A00();
                AnonymousClass002.A1J(dataInputStream.readUTF(), dataInputStream.readUTF(), arrayListA0i);
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : arrayListA0i) {
                HxE hxE = (HxE) obj;
                String str = (String) hxE.first;
                String str2 = (String) hxE.second;
                C7384Etj.A0X(str);
                if (str.length() > 0) {
                    C7384Etj.A0X(str2);
                    if (str2.length() > 0) {
                        arrayListA0h.add(obj);
                    }
                }
            }
            Map<String, String> mapA06 = AGH.A06(arrayListA0h);
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

    public static final byte[] encodeNetworks(Map<String, String> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(map.size());
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String str = (String) entryA0l.getKey();
                String str2 = (String) entryA0l.getValue();
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeUTF(str2);
            }
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C7384Etj.A0U(byteArray);
            return byteArray;
        } finally {
        }
    }
}
