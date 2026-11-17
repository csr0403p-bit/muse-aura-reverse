package X;

import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EEH extends EEG {
    public final FileStash A00;
    public final List A01;
    public final List A02;
    public final List A03;

    @Override // com.facebook.stash.events.IStashWithEvents
    public final File getFile(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        boolean zIsEmpty = this.A01.isEmpty();
        FileStash fileStash = this.A00;
        if (zIsEmpty) {
            return fileStash.getFile(str);
        }
        try {
            File file = fileStash.getFile(str);
            fileStash.hasKey(str);
            return file;
        } finally {
            A01(this);
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final File insertFile(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        boolean zIsEmpty = this.A03.isEmpty();
        FileStash fileStash = this.A00;
        if (zIsEmpty) {
            return fileStash.insertFile(str);
        }
        fileStash.hasKey(str);
        try {
            return fileStash.insertFile(str);
        } finally {
            A00();
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final boolean remove(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        return remove(str, 0, map);
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final OutputStream write(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        boolean zIsEmpty = this.A03.isEmpty();
        FileStash fileStash = this.A00;
        try {
            if (zIsEmpty) {
                return fileStash.write(str);
            }
            try {
                fileStash.hasKey(str);
                return fileStash.write(str);
            } catch (IOException e) {
                throw e;
            }
        } finally {
            A00();
        }
    }

    private final void A00() {
        Iterator it = this.A03.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onInsert");
        }
    }

    public static final void A01(EEH eeh) {
        Iterator it = eeh.A01.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onGet");
        }
    }

    public EEH(FileStash fileStash, List list) {
        super(fileStash);
        this.A00 = fileStash;
        this.A03 = BV4.A0y();
        this.A01 = BV4.A0y();
        this.A02 = BV4.A0y();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a(BrowserSessionControllerKt.WEBSOCKIFY_MODE_ATTACH);
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final boolean remove(String str, int i, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        List list = this.A02;
        boolean zIsEmpty = list.isEmpty();
        boolean zRemove = this.A00.remove(str, i);
        if (!zIsEmpty) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw BV4.A0a("onRemove");
            }
        }
        return zRemove;
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final void write(String str, byte[] bArr, Map<String, String> map) {
        AnonymousClass003.A0u(str, bArr);
        boolean zIsEmpty = this.A03.isEmpty();
        FileStash fileStash = this.A00;
        if (zIsEmpty) {
            fileStash.write(str, bArr);
            return;
        }
        fileStash.hasKey(str);
        try {
            try {
                fileStash.write(str, bArr);
            } catch (IOException e) {
                throw e;
            }
        } finally {
            A00();
        }
    }
}
