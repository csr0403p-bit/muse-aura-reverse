package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: X.GCn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9286GCn extends AbstractC9289GCq implements BLG, C20Q, C3pV {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C9286GCn.class, Object.class, "_state$volatile");
    public int A00;
    public volatile /* synthetic */ Object _state$volatile;

    public static final boolean A00(Object obj, Object obj2, C9286GCn c9286GCn) {
        boolean z;
        int i;
        int i2;
        HrH hrH;
        synchronized (c9286GCn) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj3 = atomicReferenceFieldUpdater.get(c9286GCn);
            z = false;
            if (obj == null || C7384Etj.areEqual(obj3, obj)) {
                z = true;
                if (!C7384Etj.areEqual(obj3, obj2)) {
                    atomicReferenceFieldUpdater.set(c9286GCn, obj2);
                    int i3 = c9286GCn.A00;
                    if ((i3 & 1) == 0) {
                        int i4 = i3 + 1;
                        c9286GCn.A00 = i4;
                        Object obj4 = c9286GCn.A01;
                        while (true) {
                            C9287GCo[] c9287GCoArr = (C9287GCo[]) obj4;
                            if (c9287GCoArr != null) {
                                for (C9287GCo c9287GCo : c9287GCoArr) {
                                    if (c9287GCo != null) {
                                        AtomicReference<Object> atomicReference = c9287GCo.A00;
                                        while (true) {
                                            Object obj5 = atomicReference.get();
                                            if (obj5 == null || obj5 == (hrH = HnJ.A01)) {
                                                break;
                                            }
                                            HrH hrH2 = HnJ.A00;
                                            if (obj5 != hrH2) {
                                                if (C7O.A00(obj5, hrH2, atomicReference)) {
                                                    ((GBL) obj5).resumeWith(Unit.INSTANCE);
                                                    break;
                                                }
                                            } else {
                                                if (C7O.A00(obj5, hrH, atomicReference)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            synchronized (c9286GCn) {
                                i2 = c9286GCn.A00;
                                if (i2 == i4) {
                                    break;
                                }
                                obj4 = c9286GCn.A01;
                            }
                            i4 = i2;
                        }
                        i = i4 + 1;
                    } else {
                        i = i3 + 2;
                    }
                    c9286GCn.A00 = i;
                }
            }
        }
        return z;
    }

    @Override // X.AbstractC9289GCq
    public final /* bridge */ /* synthetic */ AbstractC9293GCv A0A() {
        return new C9287GCo();
    }

    @Override // X.AbstractC9289GCq
    public final /* bridge */ /* synthetic */ AbstractC9293GCv[] A0B(int i) {
        return new C9287GCo[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BLG
    public final boolean A6e(T t, T t2) {
        HrH hrH = t;
        if (t == 0) {
            hrH = HwN.A01;
        }
        if (t2 == 0) {
            t2 = HwN.A01;
        }
        return A00(hrH, t2, this);
    }

    @Override // X.C3Em
    public final void AbQ() {
        throw C8j3.A18("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BLG
    public final void Af8(T t) {
        HrH hrH = t;
        if (t == 0) {
            hrH = HwN.A01;
        }
        A00(null, hrH, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r4.equals(r11) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:24:0x007d, B:42:0x00c4], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:31:0x0092, B:33:0x0098], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:33:0x0098, B:31:0x0092], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:33:0x0098, B:40:0x00b5], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:42:0x00c4, B:24:0x007d], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:16:0x003f, B:24:0x007d, B:26:0x0085, B:28:0x008b, B:29:0x008f, B:31:0x0092, B:40:0x00b5, B:42:0x00c4, B:44:0x00e4, B:45:0x00e9, B:33:0x0098, B:36:0x009e, B:39:0x00b2, B:22:0x006d, B:23:0x0070), top: B:51:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:16:0x003f, B:24:0x007d, B:26:0x0085, B:28:0x008b, B:29:0x008f, B:31:0x0092, B:40:0x00b5, B:42:0x00c4, B:44:0x00e4, B:45:0x00e9, B:33:0x0098, B:36:0x009e, B:39:0x00b2, B:22:0x006d, B:23:0x0070), top: B:51:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:16:0x003f, B:24:0x007d, B:26:0x0085, B:28:0x008b, B:29:0x008f, B:31:0x0092, B:40:0x00b5, B:42:0x00c4, B:44:0x00e4, B:45:0x00e9, B:33:0x0098, B:36:0x009e, B:39:0x00b2, B:22:0x006d, B:23:0x0070), top: B:51:0x0022 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.20Z<? super T>] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.GCv] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c2 -> B:24:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ed -> B:24:0x007d). Please report as a decompilation issue!!! */
    @Override // X.C22I, X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.C20Z<? super T> r14, X.HtJ<?> r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9286GCn.collect(X.20Z, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // X.BLG, X.C1BN
    public final T getValue() {
        HrH hrH = HwN.A01;
        ?? r0 = A01.get(this);
        if (r0 == hrH) {
            return null;
        }
        return r0;
    }

    public C9286GCn(Object obj) {
        this._state$volatile = obj;
    }

    @Override // X.C3pV
    public final C20Q ABr(Integer num, C78T c78t, int i) {
        return HnJ.A00(num, c78t, this, i);
    }

    @Override // X.C3Em
    public final boolean AhV(T t) {
        Af8(t);
        return true;
    }

    @Override // X.C3Em, X.C20Z
    public final Object emit(T t, HtJ<? super Unit> htJ) {
        Af8(t);
        return Unit.INSTANCE;
    }

    @Override // X.C22I
    public final List<T> getReplayCache() {
        return Collections.singletonList(getValue());
    }
}
