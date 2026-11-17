package X;

import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Clh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4084Clh extends TigonCallbacks {
    public C4086Clj A00;
    public final List<InputStream> A01;
    public final /* synthetic */ Hm1<C4086Clj> A02;

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onBody(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        C7384Etj.A0Y(byteBuffer, 0);
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArrArray = byteBuffer.array();
        } else {
            bArrArray = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArrArray);
        }
        this.A01.add(new ByteArrayInputStream(bArrArray));
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onEOM(CY1 cy1) {
        C7384Etj.A0Y(cy1, 0);
        C4086Clj c4086Clj = this.A00;
        List<InputStream> list = this.A01;
        c4086Clj.A03 = list.isEmpty() ? new ByteArrayInputStream(new byte[0]) : new SequenceInputStream(Collections.enumeration(list));
        c4086Clj.A02 = cy1;
        Hm1<C4086Clj> hm1 = this.A02;
        if (hm1.isActive()) {
            hm1.resumeWith(c4086Clj);
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onResponse(CYF cyf) {
        C7384Etj.A0Y(cyf, 0);
        this.A00.A01 = cyf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4084Clh(Hm1<? super C4086Clj> hm1) {
        this.A02 = hm1;
        C4086Clj c4086Clj = new C4086Clj();
        c4086Clj.A01 = null;
        c4086Clj.A03 = null;
        c4086Clj.A02 = null;
        c4086Clj.A00 = null;
        this.A00 = c4086Clj;
        this.A01 = new ArrayList();
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onError(TigonError tigonError, CY1 cy1) {
        AnonymousClass003.A0u(tigonError, cy1);
        C4086Clj c4086Clj = this.A00;
        c4086Clj.A00 = tigonError;
        c4086Clj.A02 = cy1;
        Hm1<C4086Clj> hm1 = this.A02;
        if (hm1.isActive()) {
            hm1.resumeWith(c4086Clj);
        }
    }
}
