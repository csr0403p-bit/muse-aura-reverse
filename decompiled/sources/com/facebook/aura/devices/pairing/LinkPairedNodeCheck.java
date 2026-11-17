package com.facebook.aura.devices.pairing;

import X.AbstractC3358CGz;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HzP;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.nodes.json.NodeListEntry;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class LinkPairedNodeCheck {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final G0U<HtJ<? super List<NodeListEntry>>, Object> pairedNodes;

    /* loaded from: classes4.dex */
    public interface Outcome {

        public final class Confirm implements Outcome {
            public static final int $stable = 8;
            public final LinkDeviceKeyRecord existing;

            public Confirm(LinkDeviceKeyRecord linkDeviceKeyRecord) {
                C7384Etj.A0Y(linkDeviceKeyRecord, 0);
                this.existing = linkDeviceKeyRecord;
            }

            public final LinkDeviceKeyRecord getExisting() {
                return this.existing;
            }
        }

        public final class Proceed implements Outcome {
            public static final int $stable = 0;
            public static final Proceed INSTANCE = new Proceed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Proceed);
            }

            public String toString() {
                return "Proceed";
            }

            public int hashCode() {
                return 1104834000;
            }
        }

        public final class Refuse implements Outcome {
            public static final int $stable = 0;
            public final LinkDeviceKeySetupFailure failure;

            public Refuse(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
                C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
                this.failure = linkDeviceKeySetupFailure;
            }

            public final LinkDeviceKeySetupFailure getFailure() {
                return this.failure;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkPairedNodeCheck", f = "LinkPairedNodeCheck.kt", l = {31}, m = "check", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkPairedNodeCheck$check$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkPairedNodeCheck.this.check(null, false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkPairedNodeCheck(G0U<? super HtJ<? super List<NodeListEntry>>, ? extends Object> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.pairedNodes = g0u;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object check(java.lang.String r9, boolean r10, X.HtJ<? super com.facebook.aura.devices.pairing.LinkPairedNodeCheck.Outcome> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.devices.pairing.LinkPairedNodeCheck.AnonymousClass1
            if (r0 == 0) goto L24
            r3 = r11
            com.facebook.aura.devices.pairing.LinkPairedNodeCheck$check$1 r3 = (com.facebook.aura.devices.pairing.LinkPairedNodeCheck.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r6 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L2a
            boolean r10 = r3.Z$0
            java.lang.Object r9 = r3.L$0
            java.lang.String r9 = (java.lang.String) r9
            goto L41
        L24:
            com.facebook.aura.devices.pairing.LinkPairedNodeCheck$check$1 r3 = new com.facebook.aura.devices.pairing.LinkPairedNodeCheck$check$1
            r3.<init>(r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r6)
            X.G0U<X.HtJ<? super java.util.List<com.facebook.aura.nodes.json.NodeListEntry>>, java.lang.Object> r0 = r8.pairedNodes     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
            r3.L$0 = r9     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
            r3.Z$0 = r10     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
            r3.label = r1     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
            java.lang.Object r6 = r0.invoke(r3)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
            if (r6 != r2) goto L44
            return r2
        L41:
            X.Hwg.A00(r6)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
        L44:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> Ld8
            goto L48
        L47:
            r6 = 0
        L48:
            com.facebook.aura.devices.token.LinkPairedNodes r4 = com.facebook.aura.devices.token.LinkPairedNodes.INSTANCE
            if (r6 != 0) goto Ld2
            X.AGi r0 = X.C0881AGi.A00
        L4e:
            java.util.List r5 = r4.matching(r0, r9)
            java.lang.Object r3 = X.AbstractC0878AGe.A0G(r5)
            com.facebook.aura.nodes.json.NodeListEntry r3 = (com.facebook.aura.nodes.json.NodeListEntry) r3
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L6e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L6e
        L62:
            if (r10 != 0) goto Ld5
            if (r6 != 0) goto La4
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r0 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.PAIRED_NODES_UNAVAILABLE
        L68:
            com.facebook.aura.devices.pairing.LinkPairedNodeCheck$Outcome$Refuse r1 = new com.facebook.aura.devices.pairing.LinkPairedNodeCheck$Outcome$Refuse
            r1.<init>(r0)
            return r1
        L6e:
            java.util.Iterator r1 = r5.iterator()
        L72:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()
            com.facebook.aura.nodes.json.NodeListEntry r0 = (com.facebook.aura.nodes.json.NodeListEntry) r0
            boolean r0 = r4.isHomeLink(r0)
            if (r0 == 0) goto L72
            goto La1
        L85:
            java.util.Iterator r2 = r5.iterator()
        L89:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r2.next()
            com.facebook.aura.nodes.json.NodeListEntry r0 = (com.facebook.aura.nodes.json.NodeListEntry) r0
            java.lang.String r1 = r4.familyOf(r0)
            java.lang.String r0 = "gadget"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89
        La1:
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r0 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.NODE_ID_IN_USE
            goto L68
        La4:
            if (r3 == 0) goto Ld5
            if (r2 == 0) goto L85
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L85
        Lae:
            java.lang.String r5 = r3.displayName
            boolean r0 = X.C7BY.A0j(r5)
            if (r0 == 0) goto Lb8
            java.lang.String r5 = r3.nodeId
        Lb8:
            java.lang.String r6 = r3.nodeId
            java.lang.String r7 = r3.deviceFamily
            if (r7 != 0) goto Lc0
            java.lang.String r7 = ""
        Lc0:
            java.lang.Long r8 = r8.lastSeenAtMs(r3)
            java.lang.String r3 = ""
            com.facebook.aura.devices.token.LinkDeviceKeyRecord r2 = new com.facebook.aura.devices.token.LinkDeviceKeyRecord
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.facebook.aura.devices.pairing.LinkPairedNodeCheck$Outcome$Confirm r1 = new com.facebook.aura.devices.pairing.LinkPairedNodeCheck$Outcome$Confirm
            r1.<init>(r2)
            return r1
        Ld2:
            r0 = r6
            goto L4e
        Ld5:
            com.facebook.aura.devices.pairing.LinkPairedNodeCheck$Outcome$Proceed r1 = com.facebook.aura.devices.pairing.LinkPairedNodeCheck.Outcome.Proceed.INSTANCE
            return r1
        Ld8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkPairedNodeCheck.check(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final LinkPairedNodeCheck forSession(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return new LinkPairedNodeCheck(new LinkPairedNodeCheck$Companion$forSession$1(abstractC3358CGz, null));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final Long lastSeenAtMs(NodeListEntry nodeListEntry) {
        Long iso8601ToMs;
        if (nodeListEntry.isOnline()) {
            return C60O.A0k();
        }
        String str = nodeListEntry.lastSeenAt;
        if (str != null && (iso8601ToMs = HatchFileOperations.INSTANCE.parseIso8601ToMs(str)) != null) {
            return iso8601ToMs;
        }
        String str2 = nodeListEntry.pairedAt;
        if (str2 != null) {
            return HatchFileOperations.INSTANCE.parseIso8601ToMs(str2);
        }
        return null;
    }
}
