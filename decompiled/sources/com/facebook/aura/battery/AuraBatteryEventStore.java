package com.facebook.aura.battery;

import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C3580CVb;
import X.C3581CVc;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class AuraBatteryEventStore {
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraBatteryEventStore";
    public final C3580CVb serializer;
    public final File storageDir;
    public final File storageFile;
    public final File tempFile;

    public AuraBatteryEventStore(Context context, C3580CVb c3580CVb, String str, String str2) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(c3580CVb, str, str2, 1);
        this.serializer = c3580CVb;
        File dir = context.getDir(str, 0);
        this.storageDir = dir;
        this.storageFile = C3cG.A0O(dir, str2);
        this.tempFile = BV5.A0L(str2, AuraPrefsStorage.TEMP_FILE_SUFFIX, dir);
    }

    public final AuraBatteryEventSnapshot load(C3581CVc c3581CVc) throws IOException {
        C7384Etj.A0Y(c3581CVc, 0);
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(BV4.A0H(this.storageFile)));
            try {
                C3580CVb c3580CVb = this.serializer;
                AuraBatteryEventSnapshot auraBatteryEventSnapshot = (dataInputStream.readShort() == 251 && dataInputStream.readShort() == 2 && dataInputStream.readLong() == c3580CVb.A00() && c3580CVb.A02(c3581CVc, dataInputStream)) ? new AuraBatteryEventSnapshot(c3581CVc, dataInputStream.readBoolean(), dataInputStream.readLong(), dataInputStream.readLong()) : null;
                dataInputStream.close();
                return auraBatteryEventSnapshot;
            } finally {
            }
        } catch (FileNotFoundException | IOException unused) {
            return null;
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void clear() {
        this.storageFile.delete();
    }

    public final void store(AuraBatteryEventSnapshot auraBatteryEventSnapshot) throws IOException {
        C7384Etj.A0Y(auraBatteryEventSnapshot, 0);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(BV4.A0I(this.tempFile)));
            try {
                C3580CVb c3580CVb = this.serializer;
                C3581CVc c3581CVc = auraBatteryEventSnapshot.metrics;
                dataOutputStream.writeShort(251);
                dataOutputStream.writeShort(2);
                dataOutputStream.writeLong(c3580CVb.A00());
                c3580CVb.A01(c3581CVc, dataOutputStream);
                dataOutputStream.writeBoolean(auraBatteryEventSnapshot.isAppInForeground);
                dataOutputStream.writeLong(auraBatteryEventSnapshot.appInstanceId);
                dataOutputStream.writeLong(auraBatteryEventSnapshot.currentSequence);
                dataOutputStream.close();
                if (this.tempFile.renameTo(this.storageFile)) {
                    return;
                }
                this.tempFile.delete();
                CFK.A06(TAG, "Failed to commit battery snapshot");
            } finally {
            }
        } catch (IOException e) {
            this.tempFile.delete();
            CFK.A0A(TAG, "Failed to store battery snapshot", e);
        }
    }
}
