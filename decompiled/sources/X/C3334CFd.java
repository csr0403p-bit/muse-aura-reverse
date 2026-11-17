package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/* renamed from: X.CFd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3334CFd implements InterfaceC3367CHl {
    public final C3336CFf A00;
    public final List<CFZ> A01;
    public volatile boolean A02;

    @Override // X.InterfaceC3363CHh
    public final int AFK() {
        List<CFZ> list = this.A01;
        int size = list.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            InterfaceC3363CHh interfaceC3363CHh = (AbstractC3333CFc) list.get(i);
            size2 += interfaceC3363CHh instanceof C3332CFa ? ((C3332CFa) interfaceC3363CHh).A00.size() : Math.round(((CFZ) interfaceC3363CHh).A01.length());
        }
        return size2 + 256;
    }

    @Override // X.InterfaceC3367CHl
    public final boolean ANC() {
        return this.A02;
    }

    @Override // X.InterfaceC3363CHh
    public final boolean AOm() {
        return true;
    }

    @Override // X.InterfaceC3363CHh
    public final void AQ9() {
        List<CFZ> list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).AQ9();
        }
    }

    @Override // X.InterfaceC3363CHh
    public final boolean AfZ() {
        this.A01.get(0);
        return false;
    }

    @Override // X.InterfaceC3363CHh
    public final void Ais(Writer writer) throws IOException {
        if (!this.A02) {
            List<CFZ> list = this.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                CFZ cfz = list.get(i);
                if (!cfz.ANC()) {
                    cfz.A00();
                }
            }
            this.A02 = true;
        }
        char c = 2;
        writer.write(123);
        writer.write("\"batches\":[");
        List<CFZ> list2 = this.A01;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CFZ cfz2 = list2.get(i2);
            if (c != 2) {
                writer.write(44);
            } else {
                c = 3;
            }
            if (!cfz2.ANC()) {
                cfz2.A00();
            }
            cfz2.A01(writer);
            writer.write(93);
            writer.write(125);
            writer.flush();
        }
        C3336CFf c3336CFf = this.A00;
        writer.write("],");
        C3341CFl c3341CFlA03 = c3336CFf.A02.A03();
        try {
            c3336CFf.A01.A00(C3339CFj.A01(c3341CFlA03, "request_info"));
            C3338CFi c3338CFi = c3336CFf.A00;
            if (c3338CFi != null) {
                C3341CFl c3341CFlA01 = C3339CFj.A01(c3341CFlA03, "config");
                SamplingPolicyConfig samplingPolicyConfig = c3338CFi.A00;
                samplingPolicyConfig.provideBaseSamplingConfigParams(c3341CFlA01);
                samplingPolicyConfig.provideUserAndAppSamplingConfigParams(c3341CFlA01);
            }
            C3343CFo.A00().A05(c3341CFlA03, writer);
            c3341CFlA03.A03();
            writer.write(125);
        } catch (Throwable th) {
            c3341CFlA03.A03();
            throw th;
        }
    }

    @Override // X.InterfaceC3363CHh
    public final String getFFDBToken() {
        return ((CFZ) C8j4.A0p(this.A01)).A02;
    }

    @Override // X.InterfaceC3367CHl
    public final void unlock() {
        List<CFZ> list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).unlock();
        }
        this.A02 = false;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/CFZ;>;LX/CFf;)V */
    public C3334CFd(C3336CFf c3336CFf, List list) {
        if (list.isEmpty()) {
            throw C60O.A0i("payloads cannot be empty");
        }
        this.A01 = list;
        this.A00 = c3336CFf;
    }
}
