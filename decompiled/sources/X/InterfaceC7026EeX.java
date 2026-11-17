package X;

import android.graphics.ColorSpace;
import java.io.OutputStream;

/* renamed from: X.EeX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7026EeX {
    boolean canResize(C6988Edo c6988Edo, C1bk c1bk, C7481Exe c7481Exe);

    boolean canTranscode(C7003Ee6 c7003Ee6);

    String getIdentifier();

    C6997Edy transcode(C6988Edo c6988Edo, OutputStream outputStream, C1bk c1bk, C7481Exe c7481Exe, C7003Ee6 c7003Ee6, Integer num, ColorSpace colorSpace);
}
