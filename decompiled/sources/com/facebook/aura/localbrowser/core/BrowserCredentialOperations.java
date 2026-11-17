package com.facebook.aura.localbrowser.core;

import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C7384Etj;
import com.hatch.browser.protocol.Command;
import com.hatch.browser.protocol.CredentialFieldKind;
import com.hatch.browser.protocol.CredentialProof;
import com.hatch.browser.protocol.ElementRef;
import com.hatch.browser.protocol.ExpectedOrigins;
import com.hatch.browser.protocol.ReportImageFormat;
import com.hatch.browser.protocol.SubmitContinuation;
import java.util.List;

/* loaded from: classes6.dex */
public final class BrowserCredentialOperations {
    public static final int $stable = 0;
    public static final BrowserCredentialOperations INSTANCE = new BrowserCredentialOperations();

    public final BrowserOperation fill(CredentialProof credentialProof, CredentialFieldKind credentialFieldKind, String str, String str2) {
        AnonymousClass005.A10(credentialProof, credentialFieldKind, str);
        return new BrowserOperation(new Command.CredentialFill(credentialProof, credentialFieldKind, str, str2), false, null, ReportImageFormat.JPEG);
    }

    public final BrowserOperation refsPreflight(List<ElementRef> list, CredentialFieldKind credentialFieldKind, ExpectedOrigins expectedOrigins) {
        AnonymousClass005.A10(list, credentialFieldKind, expectedOrigins);
        return new BrowserOperation(new Command.CredentialRefsPreflight(list, credentialFieldKind, expectedOrigins), false, null, ReportImageFormat.JPEG);
    }

    public final BrowserOperation resumeSubmit(SubmitContinuation submitContinuation) {
        C7384Etj.A0Y(submitContinuation, 0);
        return new BrowserOperation(new Command.ResumeSubmit(submitContinuation), true, null, ReportImageFormat.JPEG);
    }

    public static /* synthetic */ BrowserOperation fill$default(BrowserCredentialOperations browserCredentialOperations, CredentialProof credentialProof, CredentialFieldKind credentialFieldKind, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return browserCredentialOperations.fill(credentialProof, credentialFieldKind, str, str2);
    }

    public final BrowserOperation clear(CredentialProof credentialProof, CredentialFieldKind credentialFieldKind) {
        return new BrowserOperation(new Command.CredentialClear(credentialProof, credentialFieldKind), AnonymousClass004.A1b(credentialProof, credentialFieldKind), null, ReportImageFormat.JPEG);
    }
}
