package X;

import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: X.CHf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3361CHf implements Iterator<InterfaceC3367CHl> {
    public static final Pattern A0D = Pattern.compile(C4931DFd.FALCO_ACS_PLACEHOLDER_CLAIM);
    public int A00;
    public C4B<Object> A01;
    public InterfaceC3367CHl A02;
    public File A03;
    public boolean A04;
    public final int A05;
    public final long A06 = C3364CHi.A00() - 7;
    public final long A07 = C3364CHi.A01() - 168;
    public final DefaultFalcoAcsProvider A08;
    public final C3369CHn A09;
    public final C3336CFf A0A;
    public final C3366CHk A0B;
    public final String A0C;

    @Override // java.util.Iterator
    public final boolean hasNext() throws NumberFormatException {
        InterfaceC3367CHl c3334CFd;
        long j;
        long j2;
        if (!this.A04) {
            this.A04 = true;
            C3362CHg c3362CHg = null;
            C3365CHj c3365CHj = new C3365CHj();
            ArrayList arrayListA11 = C60O.A11(4);
            AbstractC3372CHq abstractC3372CHq = null;
            int length = 0;
            while (true) {
                C3369CHn c3369CHn = this.A09;
                if (!c3369CHn.hasNext()) {
                    break;
                }
                if (!c3369CHn.hasNext()) {
                    throw BV4.A0T();
                }
                C3368CHm c3368CHm = c3369CHn.A00;
                c3369CHn.A00 = null;
                c3369CHn.A01 = false;
                c3368CHm.getClass();
                AbstractC3372CHq abstractC3372CHq2 = c3368CHm.A01;
                int i = c3368CHm.A00;
                if (i != 1) {
                    if (i == 2) {
                        if (abstractC3372CHq != null) {
                            File file = abstractC3372CHq2.A00;
                            A00(file);
                            if (abstractC3372CHq.A00.equals(file)) {
                                abstractC3372CHq = null;
                            }
                        } else {
                            c3365CHj.A00.add(abstractC3372CHq2);
                        }
                        if (abstractC3372CHq2 instanceof C3375CHt) {
                            this.A0B.A00.A07.put(abstractC3372CHq2.A00.getName(), this.A03);
                            this.A03 = null;
                        }
                    } else if (abstractC3372CHq != null) {
                        File file2 = abstractC3372CHq2.A00;
                        C4C c4cA02 = this.A01.A02(file2);
                        try {
                            if (c4cA02.A06(this)) {
                                try {
                                    if (file2.delete()) {
                                        c4cA02.A02(this);
                                        c4cA02.A00();
                                        c4cA02.A03(this);
                                    } else {
                                        c4cA02.A03(this);
                                    }
                                } catch (Throwable th) {
                                    c4cA02.A03(this);
                                    throw th;
                                }
                            }
                        } finally {
                            c4cA02.A01();
                        }
                    } else {
                        File file3 = abstractC3372CHq2.A00;
                        if (file3.length() == 0) {
                            file3.getName();
                        } else {
                            CFZ cfz = new CFZ(this.A08, this.A0A, this.A01, file3, this.A0C);
                            arrayListA11.add(cfz);
                            length = (int) (length + cfz.A01.length());
                            this.A03 = file3;
                        }
                    }
                } else if (abstractC3372CHq2 instanceof C3375CHt) {
                    this.A01 = C4B.A01(!abstractC3372CHq2.A00.getName().equals(AbstractC3294CCd.A00()));
                } else if (abstractC3372CHq2 instanceof CHw) {
                    if (abstractC3372CHq2 instanceof C3370CHo) {
                        j = this.A06;
                    } else {
                        if (!(abstractC3372CHq2 instanceof C3376CHv)) {
                            throw BV5.A0O(abstractC3372CHq2, "directoryNode=");
                        }
                        j = this.A07;
                    }
                    try {
                        j2 = Long.parseLong(abstractC3372CHq2.A00.getName());
                    } catch (NumberFormatException unused) {
                        try {
                            C3cG.A1G("[AI] ", FGI.A0M("Failed to parse timestamp from directory name: ", abstractC3372CHq2.A00.getName()), "BatchDirectoryStructureIterator");
                        } catch (Exception unused2) {
                        }
                    }
                    if (j2 < 0 || j2 < j) {
                        abstractC3372CHq = abstractC3372CHq2;
                    }
                }
                if (length != 0 && length >= this.A05) {
                    break;
                }
            }
            int size = arrayListA11.size();
            if (size > 0) {
                this.A00 += size;
                if (size > 1) {
                    arrayListA11.size();
                    c3334CFd = new C3334CFd(this.A0A, arrayListA11);
                } else {
                    c3334CFd = (InterfaceC3367CHl) arrayListA11.get(0);
                }
                c3362CHg = new C3362CHg(c3334CFd, c3365CHj);
            }
            this.A02 = c3362CHg;
        }
        return this.A02 != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A18("File removal should be accomplished via markSuccessful");
    }

    public C3361CHf(DefaultFalcoAcsProvider defaultFalcoAcsProvider, C3336CFf c3336CFf, C3366CHk c3366CHk, File file, String str, int i, boolean z) {
        this.A09 = new C3369CHn(file, z);
        this.A0A = c3336CFf;
        this.A0B = c3366CHk;
        this.A05 = i;
        this.A08 = defaultFalcoAcsProvider;
        this.A0C = str;
    }

    public static void A00(File file) {
        if (!file.isDirectory()) {
            CFK.A0H("FileBatchPayloadIterator", "%s: not a directory, deleting anyway...", file);
        }
        file.delete();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ InterfaceC3367CHl next() {
        if (!hasNext()) {
            throw BV4.A0T();
        }
        InterfaceC3367CHl interfaceC3367CHl = this.A02;
        this.A04 = false;
        this.A02 = null;
        return interfaceC3367CHl;
    }
}
