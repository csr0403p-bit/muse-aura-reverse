package X;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes5.dex */
public final class C46 extends C4B<File>.BatchLock {
    public FileLock A00;
    public final File A01;
    public final FileChannel A02;
    public final /* synthetic */ C47 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46(C47 c47, File file) throws IOException {
        super(c47, file);
        this.A03 = c47;
        File parentFile = file.getParentFile();
        parentFile.getClass();
        if (!parentFile.isDirectory() && !file.getParentFile().mkdirs()) {
            throw BV8.A0j(file, "Unable to create parent directories for: ");
        }
        File fileA0L = BV5.A0L(file.getName(), ".lock", file.getParentFile());
        this.A01 = fileA0L;
        this.A02 = BV4.A0M(fileA0L).getChannel();
    }
}
