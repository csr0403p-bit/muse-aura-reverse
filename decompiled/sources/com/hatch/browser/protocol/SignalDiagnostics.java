package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class SignalDiagnostics {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public List<SignalRuleDiagnostic> rules;
    public int schemaVersion;

    public SignalDiagnostics(int i, List<SignalRuleDiagnostic> list) {
        C7384Etj.A0Y(list, 1);
        this.schemaVersion = i;
        this.rules = list;
    }

    /* renamed from: copy-qim9Vi0, reason: not valid java name */
    public final SignalDiagnostics m3766copyqim9Vi0(int i, List<SignalRuleDiagnostic> list) {
        C7384Etj.A0Y(list, 1);
        return new SignalDiagnostics(i, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalDiagnostics) {
                SignalDiagnostics signalDiagnostics = (SignalDiagnostics) obj;
                if (this.schemaVersion != signalDiagnostics.schemaVersion || !C7384Etj.areEqual(this.rules, signalDiagnostics.rules)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRules(List<SignalRuleDiagnostic> list) {
        C7384Etj.A0Y(list, 0);
        this.rules = list;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-qim9Vi0$default, reason: not valid java name */
    public static /* synthetic */ SignalDiagnostics m3764copyqim9Vi0$default(SignalDiagnostics signalDiagnostics, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = signalDiagnostics.schemaVersion;
        }
        if ((i2 & 2) != 0) {
            list = signalDiagnostics.rules;
        }
        C7384Etj.A0Y(list, 1);
        return new SignalDiagnostics(i, list);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3765component1pVg5ArA() {
        return this.schemaVersion;
    }

    public final List<SignalRuleDiagnostic> component2() {
        return this.rules;
    }

    public final List<SignalRuleDiagnostic> getRules() {
        return this.rules;
    }

    /* renamed from: getSchemaVersion-pVg5ArA, reason: not valid java name */
    public final int m3767getSchemaVersionpVg5ArA() {
        return this.schemaVersion;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rules, this.schemaVersion * 31);
    }

    /* renamed from: setSchemaVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3768setSchemaVersionWZ4Q5Ns(int i) {
        this.schemaVersion = i;
    }

    public String toString() {
        return C3cJ.A0L(this.rules, ", rules=", C3cI.A0x("SignalDiagnostics(schemaVersion=", String.valueOf(BV4.A03(this.schemaVersion))));
    }

    public /* synthetic */ SignalDiagnostics(int i, List list, C06H c06h) {
        this(i, list);
    }
}
