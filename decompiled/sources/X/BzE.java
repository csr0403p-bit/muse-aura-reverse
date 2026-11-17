package X;

import android.os.Trace;
import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;
import com.facebook.crudolib.prefs.UnknownVersionException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BzE implements Runnable {
    public static final String __redex_internal_original_name = "LightSharedPreferencesImpl$1";
    public final /* synthetic */ LightSharedPreferencesImpl A00;
    public final /* synthetic */ C3138BzJ A01;

    public BzE(LightSharedPreferencesImpl lightSharedPreferencesImpl, C3138BzJ c3138BzJ) {
        this.A00 = lightSharedPreferencesImpl;
        this.A01 = c3138BzJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? ValueOf;
        LightSharedPreferencesImpl lightSharedPreferencesImpl = this.A00;
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.setPriority(threadCurrentThread.getPriority());
        Trace.beginSection("LightSharedPreferences.tryLoadSharedPreference");
        String strA0M = FGI.A0M("LightSharedPreferences.init: ", LightSharedPreferencesImpl.A01(lightSharedPreferencesImpl._name));
        Trace.beginSection(strA0M.substring(0, Math.min(strA0M.length(), 127)));
        try {
            synchronized (lightSharedPreferencesImpl.A03) {
                C3140BzM c3140BzM = lightSharedPreferencesImpl.A02;
                Map map = lightSharedPreferencesImpl.A06;
                File fileAMN = c3140BzM.A01.AMN();
                if (fileAMN.exists()) {
                    try {
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileAMN), 512));
                            try {
                                int unsignedByte = dataInputStream.readUnsignedByte();
                                if (unsignedByte != 1) {
                                    throw new UnknownVersionException(FGI.A0H("Expected version 1; got ", unsignedByte));
                                }
                                int i = dataInputStream.readInt();
                                while (true) {
                                    int i2 = i - 1;
                                    if (i > 0) {
                                        int unsignedByte2 = dataInputStream.readUnsignedByte();
                                        String utf = dataInputStream.readUTF();
                                        switch (unsignedByte2) {
                                            case 0:
                                                ValueOf = Boolean.valueOf(dataInputStream.readBoolean());
                                                break;
                                            case 1:
                                                ValueOf = Integer.valueOf(dataInputStream.readInt());
                                                break;
                                            case 2:
                                                ValueOf = Long.valueOf(dataInputStream.readLong());
                                                break;
                                            case 3:
                                                ValueOf = Float.valueOf(dataInputStream.readFloat());
                                                break;
                                            case 4:
                                                ValueOf = Double.valueOf(dataInputStream.readDouble());
                                                break;
                                            case 5:
                                                ValueOf = dataInputStream.readUTF();
                                                break;
                                            case 6:
                                                int i3 = dataInputStream.readInt();
                                                ValueOf = new HashSet(i3);
                                                while (true) {
                                                    int i4 = i3 - 1;
                                                    if (i3 <= 0) {
                                                        break;
                                                    } else {
                                                        String utf2 = dataInputStream.readUTF();
                                                        C7384Etj.A0U(utf2);
                                                        ValueOf.add(utf2);
                                                        i3 = i4;
                                                    }
                                                }
                                            default:
                                                throw new IllegalArgumentException(FGI.A0H("Unsupported type with ordinal: ", unsignedByte2));
                                        }
                                        map.put(utf, ValueOf);
                                        i = i2;
                                    } else {
                                        dataInputStream.close();
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC7531Ezs.A00(dataInputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (IOException e) {
                            C3140BzM.A00(c3140BzM, fileAMN, e, false);
                        }
                    } catch (UnknownVersionException | ArrayStoreException | IllegalArgumentException e2) {
                        C3140BzM.A00(c3140BzM, fileAMN, e2, true);
                    }
                }
            }
        } finally {
            lightSharedPreferencesImpl.A0B = true;
            lightSharedPreferencesImpl.A00 = null;
            lightSharedPreferencesImpl.A08.countDown();
            Trace.endSection();
            Trace.endSection();
        }
    }
}
