package com.facebook.aura.localbrowser.core;

import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.hatch.browser.protocol.Command;
import java.util.List;

/* loaded from: classes6.dex */
public final class BrowserOperationSpec {
    public static final int $stable = 8;
    public final List<BrowserArg> args;
    public final G0U<BrowserArgs, Command> command;
    public final String description;
    public final String name;
    public final boolean observeAfter;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.localbrowser.core.BrowserOperation operation(com.facebook.aura.localbrowser.core.BrowserArgs r6) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            X.G0U<com.facebook.aura.localbrowser.core.BrowserArgs, com.hatch.browser.protocol.Command> r0 = r5.command
            java.lang.Object r4 = r0.invoke(r6)
            com.hatch.browser.protocol.Command r4 = (com.hatch.browser.protocol.Command) r4
            r3 = 0
            if (r4 == 0) goto L57
            boolean r0 = r4 instanceof com.hatch.browser.protocol.Command.Capture
            if (r0 != 0) goto L17
            boolean r0 = r4 instanceof com.hatch.browser.protocol.Command.CaptureChallenge
            if (r0 == 0) goto L54
        L17:
            java.lang.String r0 = "image_format"
            java.lang.String r1 = r6.string(r0)
            java.lang.String r0 = "jpeg"
            if (r1 != 0) goto L22
            r1 = r0
        L22:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = "png"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L57
            com.hatch.browser.protocol.ReportImageFormat r2 = com.hatch.browser.protocol.ReportImageFormat.PNG
        L32:
            java.lang.String r0 = "observe_after"
            java.lang.Boolean r0 = r6.m1243boolean(r0)
            if (r0 == 0) goto L51
            boolean r1 = r0.booleanValue()
        L3e:
            java.lang.String r0 = "failure_context"
            java.lang.String r0 = r6.string(r0)
            if (r0 == 0) goto L4b
            com.hatch.browser.protocol.FailureContext r3 = new com.hatch.browser.protocol.FailureContext
            r3.<init>(r0)
        L4b:
            com.facebook.aura.localbrowser.core.BrowserOperation r0 = new com.facebook.aura.localbrowser.core.BrowserOperation
            r0.<init>(r4, r1, r3, r2)
            return r0
        L51:
            boolean r1 = r5.observeAfter
            goto L3e
        L54:
            com.hatch.browser.protocol.ReportImageFormat r2 = com.hatch.browser.protocol.ReportImageFormat.JPEG
            goto L32
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserOperationSpec.operation(com.facebook.aura.localbrowser.core.BrowserArgs):com.facebook.aura.localbrowser.core.BrowserOperation");
    }

    public final List<BrowserArg> getArgs() {
        return this.args;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowserOperationSpec(String str, String str2, List<BrowserArg> list, boolean z, G0U<? super BrowserArgs, ? extends Command> g0u) {
        AnonymousClass005.A0x(str, str2, list);
        C7384Etj.A0Y(g0u, 4);
        this.name = str;
        this.description = str2;
        this.args = list;
        this.observeAfter = z;
        this.command = g0u;
    }
}
