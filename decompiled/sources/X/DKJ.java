package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.systrace.Systrace;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class DKJ {
    public final DKH A00;
    public final HashMap<String, C4987DKg> A01 = BV4.A0v(64);

    public final synchronized C4987DKg A00(String str) {
        C4987DKg c4987DKg;
        HashMap<String, C4987DKg> map = this.A01;
        c4987DKg = map.get(str);
        if (c4987DKg == null) {
            try {
                DKH dkh = this.A00;
                HHf.A00("MetadataDeserializer.readEntireNamespace", "type", str, true);
                try {
                    String parent = new File(str.replace(".", CustomConnectorRegisterRepositoryKt.ROOT_PATH)).getParent();
                    for (String str2 : parent == null ? new String[0] : dkh.A00.list(parent)) {
                        if (str2.endsWith(".meta")) {
                            HHf.A00("MetadataDeserializer.parse", "structGroup", str2, true);
                            try {
                                DKK dkk = new DKK(new DataInputStream(dkh.A00.open(FGI.A0U(parent, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2))), map);
                                try {
                                    DataInputStream dataInputStream = dkk.A02;
                                    dkk.A00 = dataInputStream.readBoolean();
                                    int i = dataInputStream.readShort();
                                    dkk.A01 = new String[i];
                                    for (int i2 = 0; i2 < i; i2++) {
                                        dkk.A01[i2] = dataInputStream.readUTF();
                                    }
                                    short s = dataInputStream.readShort();
                                    for (int i3 = 0; i3 < s; i3++) {
                                        int i4 = dataInputStream.readShort();
                                        C4986DKf[] c4986DKfArr = new C4986DKf[i4];
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            c4986DKfArr[i5] = new C4986DKf(DKK.A00(dkk), dkk.A00 ? dataInputStream.readUTF() : null, dataInputStream.readShort());
                                        }
                                        dkk.A03.put(dkk.A01[i3], new C4987DKg(c4986DKfArr));
                                    }
                                    dkk.close();
                                    Systrace.A03(4L);
                                } catch (Throwable th) {
                                    try {
                                        dkk.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                Systrace.A03(4L);
                                throw th3;
                            }
                        }
                    }
                    Systrace.A03(4L);
                    c4987DKg = map.get(str);
                    if (c4987DKg == null) {
                        throw new RuntimeException(FGI.A0M("No type found for ", str));
                    }
                } catch (Throwable th4) {
                    Systrace.A03(4L);
                    throw th4;
                }
            } catch (IOException e) {
                throw new RuntimeException(FGI.A0M("Failed to find ", str), e);
            }
        }
        return c4987DKg;
    }

    public DKJ(DKH dkh) {
        this.A00 = dkh;
    }
}
