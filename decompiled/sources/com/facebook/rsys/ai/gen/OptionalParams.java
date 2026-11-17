package com.facebook.rsys.ai.gen;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AnonymousClass006;
import X.BV7;
import X.C3cH;
import X.C60O;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.voiceads.gen.AdContext;
import com.facebook.rsys.voiceads.gen.CallAdsContext;
import com.facebook.rsys.voiceads.gen.LeadAdsContext;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class OptionalParams {
    public static G50<OptionalParams> CONVERTER = C8923Ftf.A00(11);
    public static long sMcfTypeId;
    public final AdContext adContext;
    public final String appLoadSessionConfig;
    public final CallAdsContext callAdsContext;
    public final String callTrigger;
    public final ArrayList<ClientToolDefinition> clientToolDefinitions;
    public final String conversationHistory;
    public final ConversationStarterPrompt conversationStarterPrompt;
    public final DatingParams datingParams;
    public final Boolean enableGenaiUnifiedResponse;
    public final String entrypointRawValue;
    public final String genaiTier;
    public final GpsLocation gpsLocation;
    public final GraphqlQueryContext graphqlQueryContext;
    public final Boolean isUserMicrophoneMuted;
    public final LeadAdsContext leadAdsContext;
    public final String llmModelName;
    public final String metaAiEphemeralThreadId;
    public final MobiusParams mobiusParams;
    public final ModelOverrides modelOverrides;
    public final ProactiveVoicePrompt proactiveVoicePrompt;
    public final String promptSessionId;
    public final Boolean psiPerQueryOptInEnabled;
    public final String psiQueryEnabled;
    public final String safetyLlmModelName;
    public final SelectedEmbodimentParams selectedEmbodimentParams;
    public final Map<String, String> sessionCount;
    public final String sgSessionId;
    public final Boolean shouldCreateUserThread;
    public final String systemPrompt;
    public final VideoContext videoContext;
    public final Boolean videoEmbodimentEnabled;
    public final WaveformsSession waveformsSession;
    public final WwwHostOverride wwwHostOverride;

    public class Builder {
        public AdContext adContext;
        public String appLoadSessionConfig;
        public CallAdsContext callAdsContext;
        public String callTrigger;
        public ArrayList<ClientToolDefinition> clientToolDefinitions;
        public String conversationHistory;
        public ConversationStarterPrompt conversationStarterPrompt;
        public DatingParams datingParams;
        public Boolean enableGenaiUnifiedResponse;
        public String entrypointRawValue;
        public String genaiTier;
        public GpsLocation gpsLocation;
        public GraphqlQueryContext graphqlQueryContext;
        public Boolean isUserMicrophoneMuted;
        public LeadAdsContext leadAdsContext;
        public String llmModelName;
        public String metaAiEphemeralThreadId;
        public MobiusParams mobiusParams;
        public ModelOverrides modelOverrides;
        public ProactiveVoicePrompt proactiveVoicePrompt;
        public String promptSessionId;
        public Boolean psiPerQueryOptInEnabled;
        public String psiQueryEnabled;
        public String safetyLlmModelName;
        public SelectedEmbodimentParams selectedEmbodimentParams;
        public Map<String, String> sessionCount;
        public String sgSessionId;
        public Boolean shouldCreateUserThread;
        public String systemPrompt;
        public VideoContext videoContext;
        public Boolean videoEmbodimentEnabled;
        public WaveformsSession waveformsSession;
        public WwwHostOverride wwwHostOverride;

        public OptionalParams build() {
            return new OptionalParams(this);
        }
    }

    public OptionalParams(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.entrypointRawValue = null;
        this.promptSessionId = null;
        this.callTrigger = null;
        this.sgSessionId = null;
        this.metaAiEphemeralThreadId = str;
        this.llmModelName = null;
        this.safetyLlmModelName = null;
        this.systemPrompt = null;
        this.proactiveVoicePrompt = null;
        this.conversationStarterPrompt = null;
        this.conversationHistory = null;
        this.modelOverrides = null;
        this.mobiusParams = null;
        this.videoEmbodimentEnabled = bool3;
        this.psiQueryEnabled = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
        this.psiPerQueryOptInEnabled = null;
        this.genaiTier = null;
        this.graphqlQueryContext = null;
        this.waveformsSession = null;
        this.adContext = null;
        this.callAdsContext = null;
        this.leadAdsContext = null;
        this.datingParams = null;
        this.selectedEmbodimentParams = null;
        this.videoContext = null;
        this.sessionCount = null;
        this.shouldCreateUserThread = null;
        this.enableGenaiUnifiedResponse = bool;
        this.appLoadSessionConfig = null;
        this.gpsLocation = null;
        this.isUserMicrophoneMuted = bool2;
        this.clientToolDefinitions = null;
        this.wwwHostOverride = null;
    }

    public static native OptionalParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARN: Code restructure failed: missing block: B:191:0x01d9, code lost:
    
        if (r1.equals(r0) != false) goto L192;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.ai.gen.OptionalParams.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iA02 = (((((((((((((((((((((((((((((((((((((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.entrypointRawValue)) + AnonymousClass006.A0G(this.promptSessionId)) * 31) + AnonymousClass006.A0G(this.callTrigger)) * 31) + AnonymousClass006.A0G(this.sgSessionId)) * 31) + AnonymousClass006.A0G(this.metaAiEphemeralThreadId)) * 31) + AnonymousClass006.A0G(this.llmModelName)) * 31) + AnonymousClass006.A0G(this.safetyLlmModelName)) * 31) + AnonymousClass006.A0G(this.systemPrompt)) * 31) + AnonymousClass006.A0D(this.proactiveVoicePrompt)) * 31) + AnonymousClass006.A0D(this.conversationStarterPrompt)) * 31) + AnonymousClass006.A0G(this.conversationHistory)) * 31) + AnonymousClass006.A0D(this.modelOverrides)) * 31) + AnonymousClass006.A0D(this.mobiusParams)) * 31) + AnonymousClass006.A0D(this.videoEmbodimentEnabled)) * 31) + AnonymousClass006.A0G(this.psiQueryEnabled)) * 31) + AnonymousClass006.A0D(this.psiPerQueryOptInEnabled)) * 31) + AnonymousClass006.A0G(this.genaiTier)) * 31) + AnonymousClass006.A0D(this.graphqlQueryContext)) * 31) + AnonymousClass006.A0D(this.waveformsSession)) * 31) + AnonymousClass006.A0D(this.adContext)) * 31) + AnonymousClass006.A0D(this.callAdsContext)) * 31) + AnonymousClass006.A0D(this.leadAdsContext)) * 31) + AnonymousClass006.A0D(this.datingParams)) * 31) + AnonymousClass006.A0D(this.selectedEmbodimentParams)) * 31) + AnonymousClass006.A0D(this.videoContext)) * 31;
        Map<String, String> map = this.sessionCount;
        return ((((((((((((((iA02 + (map == null ? 0 : map.hashCode())) * 31) + AnonymousClass006.A0D(this.shouldCreateUserThread)) * 31) + AnonymousClass006.A0D(this.enableGenaiUnifiedResponse)) * 31) + AnonymousClass006.A0G(this.appLoadSessionConfig)) * 31) + AnonymousClass006.A0D(this.gpsLocation)) * 31) + AnonymousClass006.A0D(this.isUserMicrophoneMuted)) * 31) + AnonymousClass006.A0D(this.clientToolDefinitions)) * 31) + C3cH.A02(this.wwwHostOverride);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("OptionalParams{");
        FGI.A0v("entrypointRawValue=", this.entrypointRawValue, sbA0x);
        FGI.A0v(",promptSessionId=", this.promptSessionId, sbA0x);
        FGI.A0v(",callTrigger=", this.callTrigger, sbA0x);
        FGI.A0v(",sgSessionId=", this.sgSessionId, sbA0x);
        FGI.A0v(",metaAiEphemeralThreadId=", this.metaAiEphemeralThreadId, sbA0x);
        FGI.A0v(",llmModelName=", this.llmModelName, sbA0x);
        FGI.A0v(",safetyLlmModelName=", this.safetyLlmModelName, sbA0x);
        FGI.A0v(",systemPrompt=", this.systemPrompt, sbA0x);
        AbstractC7609F5w.A1I(this.proactiveVoicePrompt, C60O.A0x(",proactiveVoicePrompt="), sbA0x);
        AbstractC7609F5w.A1I(this.conversationStarterPrompt, C60O.A0x(",conversationStarterPrompt="), sbA0x);
        FGI.A0v(",conversationHistory=", this.conversationHistory, sbA0x);
        AbstractC7609F5w.A1I(this.modelOverrides, C60O.A0x(",modelOverrides="), sbA0x);
        AbstractC7609F5w.A1I(this.mobiusParams, C60O.A0x(",mobiusParams="), sbA0x);
        AbstractC7609F5w.A1I(this.videoEmbodimentEnabled, C60O.A0x(",videoEmbodimentEnabled="), sbA0x);
        FGI.A0v(",psiQueryEnabled=", this.psiQueryEnabled, sbA0x);
        AbstractC7609F5w.A1I(this.psiPerQueryOptInEnabled, C60O.A0x(",psiPerQueryOptInEnabled="), sbA0x);
        FGI.A0v(",genaiTier=", this.genaiTier, sbA0x);
        AbstractC7609F5w.A1I(this.graphqlQueryContext, C60O.A0x(",graphqlQueryContext="), sbA0x);
        AbstractC7609F5w.A1I(this.waveformsSession, C60O.A0x(",waveformsSession="), sbA0x);
        AbstractC7609F5w.A1I(this.adContext, C60O.A0x(",adContext="), sbA0x);
        AbstractC7609F5w.A1I(this.callAdsContext, C60O.A0x(",callAdsContext="), sbA0x);
        AbstractC7609F5w.A1I(this.leadAdsContext, C60O.A0x(",leadAdsContext="), sbA0x);
        AbstractC7609F5w.A1I(this.datingParams, C60O.A0x(",datingParams="), sbA0x);
        AbstractC7609F5w.A1I(this.selectedEmbodimentParams, C60O.A0x(",selectedEmbodimentParams="), sbA0x);
        AbstractC7609F5w.A1I(this.videoContext, C60O.A0x(",videoContext="), sbA0x);
        AbstractC7609F5w.A1I(this.sessionCount, C60O.A0x(",sessionCount="), sbA0x);
        AbstractC7609F5w.A1I(this.shouldCreateUserThread, C60O.A0x(",shouldCreateUserThread="), sbA0x);
        AbstractC7609F5w.A1I(this.enableGenaiUnifiedResponse, C60O.A0x(",enableGenaiUnifiedResponse="), sbA0x);
        FGI.A0v(",appLoadSessionConfig=", this.appLoadSessionConfig, sbA0x);
        AbstractC7609F5w.A1I(this.gpsLocation, C60O.A0x(",gpsLocation="), sbA0x);
        AbstractC7609F5w.A1I(this.isUserMicrophoneMuted, C60O.A0x(",isUserMicrophoneMuted="), sbA0x);
        AbstractC7609F5w.A1I(this.clientToolDefinitions, C60O.A0x(",clientToolDefinitions="), sbA0x);
        AbstractC7609F5w.A1I(this.wwwHostOverride, C60O.A0x(",wwwHostOverride="), sbA0x);
        return BV7.A11(sbA0x);
    }

    public OptionalParams(Builder builder) {
        this.entrypointRawValue = builder.entrypointRawValue;
        this.promptSessionId = builder.promptSessionId;
        this.callTrigger = builder.callTrigger;
        this.sgSessionId = builder.sgSessionId;
        this.metaAiEphemeralThreadId = builder.metaAiEphemeralThreadId;
        this.llmModelName = builder.llmModelName;
        this.safetyLlmModelName = builder.safetyLlmModelName;
        this.systemPrompt = builder.systemPrompt;
        this.proactiveVoicePrompt = builder.proactiveVoicePrompt;
        this.conversationStarterPrompt = builder.conversationStarterPrompt;
        this.conversationHistory = builder.conversationHistory;
        this.modelOverrides = builder.modelOverrides;
        this.mobiusParams = builder.mobiusParams;
        this.videoEmbodimentEnabled = builder.videoEmbodimentEnabled;
        this.psiQueryEnabled = builder.psiQueryEnabled;
        this.psiPerQueryOptInEnabled = builder.psiPerQueryOptInEnabled;
        this.genaiTier = builder.genaiTier;
        this.graphqlQueryContext = builder.graphqlQueryContext;
        this.waveformsSession = builder.waveformsSession;
        this.adContext = builder.adContext;
        this.callAdsContext = builder.callAdsContext;
        this.leadAdsContext = builder.leadAdsContext;
        this.datingParams = builder.datingParams;
        this.selectedEmbodimentParams = builder.selectedEmbodimentParams;
        this.videoContext = builder.videoContext;
        this.sessionCount = builder.sessionCount;
        this.shouldCreateUserThread = builder.shouldCreateUserThread;
        this.enableGenaiUnifiedResponse = builder.enableGenaiUnifiedResponse;
        this.appLoadSessionConfig = builder.appLoadSessionConfig;
        this.gpsLocation = builder.gpsLocation;
        this.isUserMicrophoneMuted = builder.isUserMicrophoneMuted;
        this.clientToolDefinitions = builder.clientToolDefinitions;
        this.wwwHostOverride = builder.wwwHostOverride;
    }
}
