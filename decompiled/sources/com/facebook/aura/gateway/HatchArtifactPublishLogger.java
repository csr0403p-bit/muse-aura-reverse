package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7520Ez2;
import X.DK9;
import X.FGI;
import X.GD1;
import X.GD7;
import X.InterfaceC7539F0o;
import android.os.SystemClock;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.plog.HatchArtifactPublishDebug;
import com.facebook.aura.plog.HatchArtifactPublishDebugPLogConfigGenerated;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchArtifactPublishLogger {
    public static final int $stable = 0;
    public static final HatchArtifactPublishLogger INSTANCE = new HatchArtifactPublishLogger();
    public static final GD7<HatchArtifactPublishDebugPLogConfigGenerated> plog = GD1.A00(HatchArtifactPublishDebug.HatchArtifactPublishDebugPLogConfig);
    public static final DK9 clock = new C7520Ez2(new InterfaceC7539F0o() { // from class: com.facebook.aura.gateway.HatchArtifactPublishLogger$clock$1
        @Override // X.InterfaceC7539F0o
        public final long now() {
            return SystemClock.uptimeMillis();
        }
    });

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logRemoveException$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ Exception $exception;
        public final /* synthetic */ String $projectDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, Exception exc) {
            super(0);
            this.$projectDir = str;
            this.$elapsedMs = j;
            this.$exception = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$projectDir;
            long j = this.$elapsedMs;
            String strA0n = C60O.A0n(this.$exception);
            String message = this.$exception.getMessage();
            StringBuilder sbA0x = C3cI.A0x("removeArtifact: exception projectDir=", str);
            sbA0x.append(" elapsedMs=");
            sbA0x.append(j);
            sbA0x.append(" exceptionType=");
            sbA0x.append(strA0n);
            return C60P.A1M(" message=", message, sbA0x);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logRemoveRequestBody$1, reason: invalid class name and case insensitive filesystem */
    public final class C120441 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120441(String str) {
            super(0);
            this.$body = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return FGI.A0M("removeArtifact: requestBody=", this.$body);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logRemoveStarting$1, reason: invalid class name and case insensitive filesystem */
    public final class C120451 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $gatewayUrl;
        public final /* synthetic */ boolean $hasAuthToken;
        public final /* synthetic */ String $projectDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120451(String str, String str2, boolean z) {
            super(0);
            this.$projectDir = str;
            this.$gatewayUrl = str2;
            this.$hasAuthToken = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$projectDir;
            String str2 = this.$gatewayUrl;
            boolean z = this.$hasAuthToken;
            StringBuilder sbA0x = C3cI.A0x("removeArtifact: starting projectDir=", str);
            sbA0x.append(" gatewayUrl=");
            sbA0x.append(str2);
            sbA0x.append(" hasAuthToken=");
            sbA0x.append(z);
            return AnonymousClass001.A0v(" timeoutSeconds=60", sbA0x);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logRemoveSuccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C120461 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $destroyed;
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ String $fullResponse;
        public final /* synthetic */ String $projectDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120461(String str, String str2, long j, String str3) {
            super(0);
            this.$projectDir = str;
            this.$destroyed = str2;
            this.$elapsedMs = j;
            this.$fullResponse = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$projectDir;
            String str2 = this.$destroyed;
            long j = this.$elapsedMs;
            String str3 = this.$fullResponse;
            StringBuilder sbA0x = C3cI.A0x("removeArtifact: success projectDir=", str);
            C60R.A1K(" destroyed=", str2, sbA0x, j);
            return C60P.A1M(" fullResponse=", str3, sbA0x);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logUnpublishFailed$1, reason: invalid class name and case insensitive filesystem */
    public final class C120471 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ Map<String, String> $extraContext;
        public final /* synthetic */ String $projectDir;
        public final /* synthetic */ String $reason;
        public final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120471(String str, String str2, String str3, long j, Map<String, String> map) {
            super(0);
            this.$source = str;
            this.$projectDir = str2;
            this.$reason = str3;
            this.$elapsedMs = j;
            this.$extraContext = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$source;
            String str2 = this.$projectDir;
            String str3 = this.$reason;
            long j = this.$elapsedMs;
            Map<String, String> map = this.$extraContext;
            StringBuilder sbA0w = C60O.A0w();
            StringBuilder sbA0x = C3cI.A0x("unpublish: failed source=", str);
            sbA0x.append(" projectDir=");
            sbA0x.append(str2);
            C60R.A1K(" reason=", str3, sbA0x, j);
            sbA0w.append(sbA0x.toString());
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                sbA0w.append(FGI.A0d(InviteCodeScratcherKt.CODE_SEPARATOR, C60O.A0t(entryA0l), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, (String) entryA0l.getValue()));
            }
            return sbA0w.toString();
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logUnpublishStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C120481 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ Map<String, String> $extraContext;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $projectDir;
        public final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120481(String str, String str2, String str3, Map<String, String> map) {
            super(0);
            this.$source = str;
            this.$projectDir = str2;
            this.$fileName = str3;
            this.$extraContext = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$source;
            String str2 = this.$projectDir;
            String str3 = this.$fileName;
            Map<String, String> map = this.$extraContext;
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(FGI.A0j("unpublish: started source=", str, " projectDir=", str2, " fileName=", str3));
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                sbA0w.append(FGI.A0d(InviteCodeScratcherKt.CODE_SEPARATOR, C60O.A0t(entryA0l), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, (String) entryA0l.getValue()));
            }
            return sbA0w.toString();
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchArtifactPublishLogger$logUnpublishSuccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C120491 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $destroyed;
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ String $projectDir;
        public final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120491(String str, String str2, String str3, long j) {
            super(0);
            this.$source = str;
            this.$projectDir = str2;
            this.$destroyed = str3;
            this.$elapsedMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$source;
            String str2 = this.$projectDir;
            String str3 = this.$destroyed;
            long j = this.$elapsedMs;
            StringBuilder sbA0x = C3cI.A0x("unpublish: succeeded source=", str);
            sbA0x.append(" projectDir=");
            sbA0x.append(str2);
            C60R.A1K(" destroyed=", str3, sbA0x, j);
            return sbA0x.toString();
        }
    }

    public final void logRemoveRequestBody(String str) {
        C7384Etj.A0Y(str, 0);
        plog.A8B(new C120441(str));
    }

    public final void logRemoveStarting(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        plog.ANP(new C120451(str, str2, z));
    }

    public final long now() {
        return clock.now();
    }

    public final void logRemoveException(String str, long j, Exception exc) {
        AnonymousClass003.A0v(str, exc);
        plog.A9n(exc, new AnonymousClass1(str, j, exc));
    }

    public final void logRemoveSuccess(String str, String str2, long j, String str3) {
        AnonymousClass003.A0u(str, str2);
        plog.ANP(new C120461(str, str2, j, str3));
    }

    public final void logUnpublishFailed(String str, String str2, String str3, long j, Map<String, String> map) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(map, 4);
        plog.A9o(new C120471(str, str2, str3, j, map));
    }

    public final void logUnpublishStarted(String str, String str2, String str3, Map<String, String> map) {
        AnonymousClass005.A14(str, str2, str3, map);
        plog.ANP(new C120481(str, str2, str3, map));
    }

    public final void logUnpublishSuccess(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        plog.ANP(new C120491(str, str2, str3, j));
    }
}
