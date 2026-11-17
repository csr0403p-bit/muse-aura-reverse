package X;

import android.media.ExifInterface;
import java.io.FileDescriptor;

/* renamed from: X.Edj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6983Edj extends AbstractC7025EeW<C6988Edo> {
    public static final String __redex_internal_original_name = "LocalExifThumbnailProducer$1";
    public final /* synthetic */ C6985Edl A00;
    public final /* synthetic */ C7183Eht A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6983Edj(InterfaceC7028EeZ interfaceC7028EeZ, C6985Edl c6985Edl, InterfaceC7029Eea interfaceC7029Eea, InterfaceC7027EeY interfaceC7027EeY, C7183Eht c7183Eht) {
        super(interfaceC7028EeZ, interfaceC7029Eea, interfaceC7027EeY, "LocalExifThumbnailProducer");
        this.A01 = c7183Eht;
        this.A00 = c6985Edl;
    }

    public static final ExifInterface A00(FileDescriptor fileDescriptor) {
        return new ExifInterface(fileDescriptor);
    }
}
