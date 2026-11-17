package X;

import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.outgoingcallconfig.gen.StateSyncMessage;
import com.facebook.rsys.transport.gen.SignalingProtocolParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GTH extends C06G {
    public final AudioStateManagerProxy A00;
    public final GVw A01;
    public final MetaAiVoiceStateProxy A02;
    public final SignalingProtocolParams A03;
    public final G8W A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List<String> A0C;
    public final List<DataMessage> A0D;
    public final List<StateSyncMessage> A0E;
    public final List<String> A0F;
    public final Function0<CallContext> A0G;
    public final G0U<GR9, Unit> A0H;
    public final G0U<G0U<? super AudioFrame, Integer>, Unit> A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GTH) {
                GTH gth = (GTH) obj;
                if (!C7384Etj.areEqual(this.A09, gth.A09) || !C7384Etj.areEqual(this.A0A, gth.A0A) || !C7384Etj.areEqual(this.A0B, gth.A0B) || !C7384Etj.areEqual(this.A02, gth.A02) || !C7384Etj.areEqual(this.A0G, gth.A0G) || !C7384Etj.areEqual(this.A04, gth.A04) || !C7384Etj.areEqual(this.A05, gth.A05) || !C7384Etj.areEqual(this.A06, gth.A06) || !C7384Etj.areEqual(this.A08, gth.A08) || !C7384Etj.areEqual(this.A07, gth.A07) || !C7384Etj.areEqual(this.A0C, gth.A0C) || !C7384Etj.areEqual(this.A0F, gth.A0F) || !C7384Etj.areEqual(this.A0H, gth.A0H) || this.A0M != gth.A0M || this.A0J != gth.A0J || this.A0L != gth.A0L || !C7384Etj.areEqual(this.A0D, gth.A0D) || !C7384Etj.areEqual(this.A00, gth.A00) || !C7384Etj.areEqual(this.A0E, gth.A0E) || !C7384Etj.areEqual(this.A03, gth.A03) || !C7384Etj.areEqual(this.A01, gth.A01) || this.A0K != gth.A0K || this.A0N != gth.A0N || !C7384Etj.areEqual(this.A0I, gth.A0I)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A0I, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.A01, (((((((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.A0H, (((((((((((AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A0G, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0I(this.A0B, AnonymousClass005.A0I(this.A0A, AnonymousClass001.A0G(this.A09)))))) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + AnonymousClass006.A0D(this.A0C)) * 31) + AnonymousClass006.A0D(this.A0F)) * 31), this.A0M), this.A0J), this.A0L) + AnonymousClass006.A0D(this.A0D)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A0E)) * 31) + C3cH.A02(this.A03)) * 31), this.A0K), this.A0N));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/rsys/metaaivoicestate/gen/MetaAiVoiceStateProxy;Lkotlin/jvm/functions/Function0<+Lcom/facebook/rsys/callcontext/gen/CallContext;>;LX/G8W;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;LX/G0U<-LX/GR9;Lkotlin/Unit;>;ZZZLjava/util/List<+Lcom/facebook/rsys/call/datamessage/gen/DataMessage;>;Lcom/facebook/rsys/appdrivenaudio/gen/AudioStateManagerProxy;Ljava/util/List<+Lcom/facebook/rsys/outgoingcallconfig/gen/StateSyncMessage;>;Lcom/facebook/rsys/transport/gen/SignalingProtocolParams;LX/GVw;ZZLX/G0U<-LX/G0U<-Lcom/facebook/rsys/audio/frame/gen/AudioFrame;Ljava/lang/Integer;>;Lkotlin/Unit;>;)V */
    public GTH(AudioStateManagerProxy audioStateManagerProxy, GVw gVw, MetaAiVoiceStateProxy metaAiVoiceStateProxy, SignalingProtocolParams signalingProtocolParams, G8W g8w, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, Function0 function0, G0U g0u, G0U g0u2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass005.A11(str, str3, metaAiVoiceStateProxy, 0);
        C7384Etj.A0Y(gVw, 20);
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A02 = metaAiVoiceStateProxy;
        this.A0G = function0;
        this.A04 = g8w;
        this.A05 = str4;
        this.A06 = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A0C = list;
        this.A0F = list2;
        this.A0H = g0u;
        this.A0M = z;
        this.A0J = z2;
        this.A0L = z3;
        this.A0D = list3;
        this.A00 = audioStateManagerProxy;
        this.A0E = list4;
        this.A03 = signalingProtocolParams;
        this.A01 = gVw;
        this.A0K = z4;
        this.A0N = z5;
        this.A0I = g0u2;
    }
}
