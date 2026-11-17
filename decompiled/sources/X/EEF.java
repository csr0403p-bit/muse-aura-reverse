package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class EEF extends EEG {
    public final DK9 A00;
    public final FileStash A01;
    public final Set<String> A02;
    public volatile long A03;

    @Override // com.facebook.stash.events.IStashWithEvents
    public final File getFile(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        if (this.A03 == -28800000 || this.A02.contains(str)) {
            return this.A01.getFile(str);
        }
        return null;
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final File insertFile(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        this.A02.add(str);
        return this.A01.insertFile(str);
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final boolean remove(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        this.A02.remove(str);
        return this.A01.remove(str);
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final OutputStream write(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        this.A02.add(str);
        return new EEN(this, this.A01.write(str), str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EEF(FileStash fileStash) {
        super(fileStash);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A01 = fileStash;
        this.A00 = realtimeSinceBootClock;
        this.A02 = ConcurrentHashMap.newKeySet();
        this.A03 = -28800000L;
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final boolean remove(String str, int i, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        this.A02.remove(str);
        return this.A01.remove(str, i);
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final void write(String str, byte[] bArr, Map<String, String> map) {
        AnonymousClass003.A0u(str, bArr);
        this.A01.write(str, bArr);
        this.A02.add(str);
    }
}
