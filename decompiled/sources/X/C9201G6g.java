package X;

import java.net.URI;

/* renamed from: X.G6g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9201G6g extends AbstractC9200G6f {
    public static final C06827l3 A02 = C06827l3.A02("[^a-zA-Z0-9 ]");
    public final C9197G6c A00;
    public final C9199G6e A01;

    public C9201G6g(URI uri, C9211G6r c9211G6r) {
        super(uri, false);
        this.A01 = new C9199G6e(uri, c9211G6r, false);
        this.A00 = new C9197G6c(uri, false);
    }
}
