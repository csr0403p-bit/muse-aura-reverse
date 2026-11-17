package com.facebook.aura.watchhandoff;

import X.C3cG;
import X.C7384Etj;
import android.content.Context;
import android.util.AtomicFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class WatchSessionLinkStore {
    public static final int $stable = 8;
    public final AtomicFile file;

    public WatchSessionLinkStore(Context context) {
        C7384Etj.A0Y(context, 0);
        this.file = new AtomicFile(C3cG.A0O(context.getNoBackupFilesDir(), "watch_session_link_v1"));
    }

    public final WatchStoredLink read() throws IOException {
        try {
            DataInputStream dataInputStream = new DataInputStream(this.file.openRead());
            try {
                if (dataInputStream.readInt() != 1) {
                    dataInputStream.close();
                    return null;
                }
                String utf = dataInputStream.readUTF();
                dataInputStream.readUTF();
                C7384Etj.A0X(utf);
                String utf2 = dataInputStream.readUTF();
                C7384Etj.A0U(utf2);
                String utf3 = dataInputStream.readUTF();
                if (utf3.length() == 0) {
                    utf3 = null;
                }
                WatchStoredLink watchStoredLink = new WatchStoredLink(utf, utf2, utf3);
                dataInputStream.close();
                return watchStoredLink;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final void clear() {
        this.file.delete();
    }

    public final boolean write(WatchStoredLink watchStoredLink) throws IOException {
        FileOutputStream fileOutputStreamStartWrite;
        C7384Etj.A0Y(watchStoredLink, 0);
        try {
            fileOutputStreamStartWrite = this.file.startWrite();
        } catch (IOException unused) {
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStreamStartWrite);
            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF(watchStoredLink.userId);
            dataOutputStream.writeUTF("");
            dataOutputStream.writeUTF(watchStoredLink.linkId);
            String str = watchStoredLink.nodeId;
            dataOutputStream.writeUTF(str != null ? str : "");
            dataOutputStream.flush();
            this.file.finishWrite(fileOutputStreamStartWrite);
            return true;
        } catch (IOException unused2) {
            this.file.failWrite(fileOutputStreamStartWrite);
            return false;
        }
    }
}
