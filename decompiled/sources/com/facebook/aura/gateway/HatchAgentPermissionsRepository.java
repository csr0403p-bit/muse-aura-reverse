package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BGK;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C27k;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3rb;
import X.C60N;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.C9X;
import X.C9jH;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.Ey9;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GAt;
import X.GBM;
import X.GDB;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.HzR;
import X.InterfaceC7549F2g;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.auth.credentialmanager.MC;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.toast.api.ToastApi;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _decisionConfirmationStalled;
    public final BLG<Boolean> _hasLoadedServerApprovals;
    public final BLG<Long> _historyRefreshVersion;
    public final BLG<List<AgentPermissionApproval>> _localPendingApprovals;
    public final BLG<List<AgentPermissionApproval>> _serverPendingApprovals;
    public final C1BN<Set<String>> confirmingApprovalIds;
    public final ApprovalDecideReadGate decideReadGate;
    public final C1BN<Boolean> decisionConfirmationStalled;
    public final C1BN<Boolean> hasLoadedServerApprovals;
    public final C1BN<Long> historyRefreshVersion;
    public long lastAppliedSnapshotMs;
    public List<ApprovalSnapshotRecordJson> lastRecentApprovals;
    public final LinkedHashMap<String, LocalPendingApprovalRecord> localPendingApprovalRecords;
    public final Object localPendingApprovalsLock;
    public HoC lostDecideReadJob;
    public final Object lostDecideReadLock;
    public final HzR<Unit> lostDecideReadWake;
    public final HatchApprovalMessageEditor messageEditor;
    public volatile HoC observationJob;
    public final C1BN<List<AgentPermissionApproval>> pendingApprovals;
    public final SingleFlight recoverySingleFlight;
    public final Set<String> resolvedServerApprovalIds;
    public final C3UX scope;
    public final Object serverPendingApprovalsLock;
    public final AbstractC3358CGz userSession;
    public final Set<String> walletSelectionsInFlight;
    public final Object walletSelectionsLock;
    public long websocketSnapshotVersion;

    public final class AgentPermissionApproval extends C06G {
        public static final int $stable = 0;
        public final String approvalId;
        public final ApprovalRecord approvalRecord;
        public final String attentionLabel;
        public final ApprovalAttentionMode attentionMode;
        public final String cardTitle;
        public final String connectorDisplayName;
        public final Boolean connectorTurnGrantEligible;
        public final List<AgentPermissionDecisionOption> decisionOptions;
        public final List<AgentPermissionDetailRow> detailRows;
        public final String displayName;
        public final boolean editableMessageAvailable;
        public final Integer iconRes;
        public final String iconUrl;
        public final boolean isExclusive;
        public final Long messageRevision;
        public final ApprovalOrigin origin;
        public final AgentPermissionPayloadType payloadType;
        public final String permissionCaption;
        public final String permissionQuestion;
        public final String purposeSummary;
        public final AgentPermissionRequestPresentation requestPresentation;
        public final String requestPreview;
        public final AgentPermissionRequestPreviewDocument requestPreviewDocument;
        public final boolean requestPreviewDocumentSent;
        public final long requestedAtMs;
        public final String reviewText;
        public final AgentPermissionRichPayload richPayload;
        public final String rootAgentId;
        public final String scopeDisplayName;
        public final String scopeSummary;
        public final String threadId;
        public final String totalPromoCaption;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionApproval) {
                    AgentPermissionApproval agentPermissionApproval = (AgentPermissionApproval) obj;
                    if (!C7384Etj.areEqual(this.approvalId, agentPermissionApproval.approvalId) || this.isExclusive != agentPermissionApproval.isExclusive || this.attentionMode != agentPermissionApproval.attentionMode || this.requestedAtMs != agentPermissionApproval.requestedAtMs || !C7384Etj.areEqual(this.approvalRecord, agentPermissionApproval.approvalRecord) || !C7384Etj.areEqual(this.attentionLabel, agentPermissionApproval.attentionLabel) || !C7384Etj.areEqual(this.cardTitle, agentPermissionApproval.cardTitle) || !C7384Etj.areEqual(this.reviewText, agentPermissionApproval.reviewText) || !C7384Etj.areEqual(this.scopeSummary, agentPermissionApproval.scopeSummary) || !C7384Etj.areEqual(this.purposeSummary, agentPermissionApproval.purposeSummary) || !C7384Etj.areEqual(this.permissionQuestion, agentPermissionApproval.permissionQuestion) || !C7384Etj.areEqual(this.permissionCaption, agentPermissionApproval.permissionCaption) || !C7384Etj.areEqual(this.totalPromoCaption, agentPermissionApproval.totalPromoCaption) || this.requestPresentation != agentPermissionApproval.requestPresentation || !C7384Etj.areEqual(this.requestPreviewDocument, agentPermissionApproval.requestPreviewDocument) || this.requestPreviewDocumentSent != agentPermissionApproval.requestPreviewDocumentSent || !C7384Etj.areEqual(this.requestPreview, agentPermissionApproval.requestPreview) || !C7384Etj.areEqual(this.detailRows, agentPermissionApproval.detailRows) || this.payloadType != agentPermissionApproval.payloadType || !C7384Etj.areEqual(this.iconUrl, agentPermissionApproval.iconUrl) || !C7384Etj.areEqual(this.iconRes, agentPermissionApproval.iconRes) || !C7384Etj.areEqual(this.displayName, agentPermissionApproval.displayName) || !C7384Etj.areEqual(this.connectorDisplayName, agentPermissionApproval.connectorDisplayName) || !C7384Etj.areEqual(this.rootAgentId, agentPermissionApproval.rootAgentId) || !C7384Etj.areEqual(this.scopeDisplayName, agentPermissionApproval.scopeDisplayName) || this.origin != agentPermissionApproval.origin || !C7384Etj.areEqual(this.threadId, agentPermissionApproval.threadId) || !C7384Etj.areEqual(this.decisionOptions, agentPermissionApproval.decisionOptions) || !C7384Etj.areEqual(this.richPayload, agentPermissionApproval.richPayload) || this.editableMessageAvailable != agentPermissionApproval.editableMessageAvailable || !C7384Etj.areEqual(this.messageRevision, agentPermissionApproval.messageRevision) || !C7384Etj.areEqual(this.connectorTurnGrantEligible, agentPermissionApproval.connectorTurnGrantEligible)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.approvalId;
        }

        public final String component10() {
            return this.purposeSummary;
        }

        public final String component11() {
            return this.permissionQuestion;
        }

        public final String component12() {
            return this.permissionCaption;
        }

        public final String component13() {
            return this.totalPromoCaption;
        }

        public final AgentPermissionRequestPresentation component14() {
            return this.requestPresentation;
        }

        public final AgentPermissionRequestPreviewDocument component15() {
            return this.requestPreviewDocument;
        }

        public final boolean component16() {
            return this.requestPreviewDocumentSent;
        }

        public final String component17() {
            return this.requestPreview;
        }

        public final List<AgentPermissionDetailRow> component18() {
            return this.detailRows;
        }

        public final AgentPermissionPayloadType component19() {
            return this.payloadType;
        }

        public final boolean component2() {
            return this.isExclusive;
        }

        public final String component20() {
            return this.iconUrl;
        }

        public final Integer component21() {
            return this.iconRes;
        }

        public final String component22() {
            return this.displayName;
        }

        public final String component23() {
            return this.connectorDisplayName;
        }

        public final String component24() {
            return this.rootAgentId;
        }

        public final String component25() {
            return this.scopeDisplayName;
        }

        public final ApprovalOrigin component26() {
            return this.origin;
        }

        public final String component27() {
            return this.threadId;
        }

        public final List<AgentPermissionDecisionOption> component28() {
            return this.decisionOptions;
        }

        public final AgentPermissionRichPayload component29() {
            return this.richPayload;
        }

        public final ApprovalAttentionMode component3() {
            return this.attentionMode;
        }

        public final boolean component30() {
            return this.editableMessageAvailable;
        }

        public final Long component31() {
            return this.messageRevision;
        }

        public final Boolean component32() {
            return this.connectorTurnGrantEligible;
        }

        public final long component4() {
            return this.requestedAtMs;
        }

        public final ApprovalRecord component5() {
            return this.approvalRecord;
        }

        public final String component6() {
            return this.attentionLabel;
        }

        public final String component7() {
            return this.cardTitle;
        }

        public final String component8() {
            return this.reviewText;
        }

        public final String component9() {
            return this.scopeSummary;
        }

        public final String getApprovalId() {
            return this.approvalId;
        }

        public final ApprovalRecord getApprovalRecord() {
            return this.approvalRecord;
        }

        public final String getAttentionLabel() {
            return this.attentionLabel;
        }

        public final ApprovalAttentionMode getAttentionMode() {
            return this.attentionMode;
        }

        public final String getCardTitle() {
            return this.cardTitle;
        }

        public final String getConnectorDisplayName() {
            return this.connectorDisplayName;
        }

        public final Boolean getConnectorTurnGrantEligible() {
            return this.connectorTurnGrantEligible;
        }

        public final List<AgentPermissionDecisionOption> getDecisionOptions() {
            return this.decisionOptions;
        }

        public final List<AgentPermissionDetailRow> getDetailRows() {
            return this.detailRows;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean getEditableMessageAvailable() {
            return this.editableMessageAvailable;
        }

        public final Integer getIconRes() {
            return this.iconRes;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final Long getMessageRevision() {
            return this.messageRevision;
        }

        public final ApprovalOrigin getOrigin() {
            return this.origin;
        }

        public final AgentPermissionPayloadType getPayloadType() {
            return this.payloadType;
        }

        public final String getPermissionCaption() {
            return this.permissionCaption;
        }

        public final String getPermissionQuestion() {
            return this.permissionQuestion;
        }

        public final String getPurposeSummary() {
            return this.purposeSummary;
        }

        public final AgentPermissionRequestPresentation getRequestPresentation() {
            return this.requestPresentation;
        }

        public final String getRequestPreview() {
            return this.requestPreview;
        }

        public final AgentPermissionRequestPreviewDocument getRequestPreviewDocument() {
            return this.requestPreviewDocument;
        }

        public final boolean getRequestPreviewDocumentSent() {
            return this.requestPreviewDocumentSent;
        }

        public final long getRequestedAtMs() {
            return this.requestedAtMs;
        }

        public final String getReviewText() {
            return this.reviewText;
        }

        public final AgentPermissionRichPayload getRichPayload() {
            return this.richPayload;
        }

        public final String getRootAgentId() {
            return this.rootAgentId;
        }

        public final String getScopeDisplayName() {
            return this.scopeDisplayName;
        }

        public final String getScopeSummary() {
            return this.scopeSummary;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        public final String getTotalPromoCaption() {
            return this.totalPromoCaption;
        }

        public int hashCode() {
            return ((C0KA.A01((AnonymousClass005.A0F(this.decisionOptions, (AnonymousClass005.A0F(this.origin, (((((((((((AnonymousClass005.A0F(this.payloadType, AnonymousClass005.A0F(this.detailRows, (C0KA.A01((AnonymousClass005.A0F(this.requestPresentation, ((((((((((((((((((AnonymousClass006.A05(this.requestedAtMs, AnonymousClass005.A0F(this.attentionMode, C0KA.A01(AnonymousClass001.A0G(this.approvalId), this.isExclusive))) * 31) + AnonymousClass006.A0D(this.approvalRecord)) * 31) + AnonymousClass006.A0G(this.attentionLabel)) * 31) + AnonymousClass006.A0G(this.cardTitle)) * 31) + AnonymousClass006.A0G(this.reviewText)) * 31) + AnonymousClass006.A0G(this.scopeSummary)) * 31) + AnonymousClass006.A0G(this.purposeSummary)) * 31) + AnonymousClass006.A0G(this.permissionQuestion)) * 31) + AnonymousClass006.A0G(this.permissionCaption)) * 31) + AnonymousClass006.A0G(this.totalPromoCaption)) * 31) + AnonymousClass006.A0D(this.requestPreviewDocument)) * 31, this.requestPreviewDocumentSent) + AnonymousClass006.A0G(this.requestPreview)) * 31)) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0D(this.iconRes)) * 31) + AnonymousClass006.A0G(this.displayName)) * 31) + AnonymousClass006.A0G(this.connectorDisplayName)) * 31) + AnonymousClass006.A0G(this.rootAgentId)) * 31) + AnonymousClass006.A0G(this.scopeDisplayName)) * 31) + AnonymousClass006.A0G(this.threadId)) * 31) + AnonymousClass006.A0D(this.richPayload)) * 31, this.editableMessageAvailable) + AnonymousClass006.A0D(this.messageRevision)) * 31) + C3cH.A02(this.connectorTurnGrantEligible);
        }

        public final boolean isExclusive() {
            return this.isExclusive;
        }

        public String toString() {
            return super.toString();
        }

        public AgentPermissionApproval(String str, boolean z, ApprovalAttentionMode approvalAttentionMode, long j, ApprovalRecord approvalRecord, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AgentPermissionRequestPresentation agentPermissionRequestPresentation, AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, boolean z2, String str10, List<AgentPermissionDetailRow> list, AgentPermissionPayloadType agentPermissionPayloadType, String str11, Integer num, String str12, String str13, String str14, String str15, ApprovalOrigin approvalOrigin, String str16, List<AgentPermissionDecisionOption> list2, AgentPermissionRichPayload agentPermissionRichPayload, boolean z3, Long l, Boolean bool) {
            AnonymousClass003.A0v(str, approvalAttentionMode);
            C3cI.A1I(agentPermissionRequestPresentation, 13, list);
            C7384Etj.A0Y(agentPermissionPayloadType, 18);
            C7384Etj.A0Y(approvalOrigin, 25);
            C7384Etj.A0Y(list2, 27);
            this.approvalId = str;
            this.isExclusive = z;
            this.attentionMode = approvalAttentionMode;
            this.requestedAtMs = j;
            this.approvalRecord = approvalRecord;
            this.attentionLabel = str2;
            this.cardTitle = str3;
            this.reviewText = str4;
            this.scopeSummary = str5;
            this.purposeSummary = str6;
            this.permissionQuestion = str7;
            this.permissionCaption = str8;
            this.totalPromoCaption = str9;
            this.requestPresentation = agentPermissionRequestPresentation;
            this.requestPreviewDocument = agentPermissionRequestPreviewDocument;
            this.requestPreviewDocumentSent = z2;
            this.requestPreview = str10;
            this.detailRows = list;
            this.payloadType = agentPermissionPayloadType;
            this.iconUrl = str11;
            this.iconRes = num;
            this.displayName = str12;
            this.connectorDisplayName = str13;
            this.rootAgentId = str14;
            this.scopeDisplayName = str15;
            this.origin = approvalOrigin;
            this.threadId = str16;
            this.decisionOptions = list2;
            this.richPayload = agentPermissionRichPayload;
            this.editableMessageAvailable = z3;
            this.messageRevision = l;
            this.connectorTurnGrantEligible = bool;
        }

        public final AgentPermissionApproval copy(String str, boolean z, ApprovalAttentionMode approvalAttentionMode, long j, ApprovalRecord approvalRecord, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AgentPermissionRequestPresentation agentPermissionRequestPresentation, AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, boolean z2, String str10, List<AgentPermissionDetailRow> list, AgentPermissionPayloadType agentPermissionPayloadType, String str11, Integer num, String str12, String str13, String str14, String str15, ApprovalOrigin approvalOrigin, String str16, List<AgentPermissionDecisionOption> list2, AgentPermissionRichPayload agentPermissionRichPayload, boolean z3, Long l, Boolean bool) {
            AnonymousClass003.A0v(str, approvalAttentionMode);
            C3cI.A1I(agentPermissionRequestPresentation, 13, list);
            C7384Etj.A0Y(agentPermissionPayloadType, 18);
            C7384Etj.A0Y(approvalOrigin, 25);
            C7384Etj.A0Y(list2, 27);
            return new AgentPermissionApproval(str, z, approvalAttentionMode, j, approvalRecord, str2, str3, str4, str5, str6, str7, str8, str9, agentPermissionRequestPresentation, agentPermissionRequestPreviewDocument, z2, str10, list, agentPermissionPayloadType, str11, num, str12, str13, str14, str15, approvalOrigin, str16, list2, agentPermissionRichPayload, z3, l, bool);
        }

        public static /* synthetic */ AgentPermissionApproval copy$default(AgentPermissionApproval agentPermissionApproval, String str, boolean z, ApprovalAttentionMode approvalAttentionMode, long j, ApprovalRecord approvalRecord, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AgentPermissionRequestPresentation agentPermissionRequestPresentation, AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, boolean z2, String str10, List list, AgentPermissionPayloadType agentPermissionPayloadType, String str11, Integer num, String str12, String str13, String str14, String str15, ApprovalOrigin approvalOrigin, String str16, List list2, AgentPermissionRichPayload agentPermissionRichPayload, boolean z3, Long l, Boolean bool, int i, Object obj) {
            String str17 = str;
            boolean z4 = z;
            ApprovalAttentionMode approvalAttentionMode2 = approvalAttentionMode;
            long j2 = j;
            ApprovalRecord approvalRecord2 = approvalRecord;
            String str18 = str2;
            String str19 = str3;
            String str20 = str4;
            String str21 = str5;
            String str22 = str6;
            String str23 = str7;
            String str24 = str8;
            String str25 = str9;
            AgentPermissionRequestPresentation agentPermissionRequestPresentation2 = agentPermissionRequestPresentation;
            AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument2 = agentPermissionRequestPreviewDocument;
            boolean z5 = z2;
            ApprovalOrigin approvalOrigin2 = approvalOrigin;
            String str26 = str16;
            List list3 = list2;
            AgentPermissionRichPayload agentPermissionRichPayload2 = agentPermissionRichPayload;
            boolean z6 = z3;
            Long l2 = l;
            String str27 = str10;
            List list4 = list;
            AgentPermissionPayloadType agentPermissionPayloadType2 = agentPermissionPayloadType;
            String str28 = str11;
            Integer num2 = num;
            String str29 = str12;
            String str30 = str13;
            String str31 = str14;
            String str32 = str15;
            Boolean bool2 = bool;
            if ((i & 1) != 0) {
                str17 = agentPermissionApproval.approvalId;
            }
            if ((i & 2) != 0) {
                z4 = agentPermissionApproval.isExclusive;
            }
            if ((i & 4) != 0) {
                approvalAttentionMode2 = agentPermissionApproval.attentionMode;
            }
            if ((i & 8) != 0) {
                j2 = agentPermissionApproval.requestedAtMs;
            }
            if ((i & 16) != 0) {
                approvalRecord2 = agentPermissionApproval.approvalRecord;
            }
            if ((i & 32) != 0) {
                str18 = agentPermissionApproval.attentionLabel;
            }
            if ((i & 64) != 0) {
                str19 = agentPermissionApproval.cardTitle;
            }
            if ((i & 128) != 0) {
                str20 = agentPermissionApproval.reviewText;
            }
            if ((i & 256) != 0) {
                str21 = agentPermissionApproval.scopeSummary;
            }
            if ((i & 512) != 0) {
                str22 = agentPermissionApproval.purposeSummary;
            }
            if ((i & 1024) != 0) {
                str23 = agentPermissionApproval.permissionQuestion;
            }
            if ((i & 2048) != 0) {
                str24 = agentPermissionApproval.permissionCaption;
            }
            if ((i & 4096) != 0) {
                str25 = agentPermissionApproval.totalPromoCaption;
            }
            if ((i & 8192) != 0) {
                agentPermissionRequestPresentation2 = agentPermissionApproval.requestPresentation;
            }
            if ((i & 16384) != 0) {
                agentPermissionRequestPreviewDocument2 = agentPermissionApproval.requestPreviewDocument;
            }
            if ((i & 32768) != 0) {
                z5 = agentPermissionApproval.requestPreviewDocumentSent;
            }
            if ((i & 65536) != 0) {
                str27 = agentPermissionApproval.requestPreview;
            }
            if ((i & 131072) != 0) {
                list4 = agentPermissionApproval.detailRows;
            }
            if ((i & 262144) != 0) {
                agentPermissionPayloadType2 = agentPermissionApproval.payloadType;
            }
            if ((i & 524288) != 0) {
                str28 = agentPermissionApproval.iconUrl;
            }
            if ((i & 1048576) != 0) {
                num2 = agentPermissionApproval.iconRes;
            }
            if ((i & 2097152) != 0) {
                str29 = agentPermissionApproval.displayName;
            }
            if ((i & 4194304) != 0) {
                str30 = agentPermissionApproval.connectorDisplayName;
            }
            if ((i & 8388608) != 0) {
                str31 = agentPermissionApproval.rootAgentId;
            }
            if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
                str32 = agentPermissionApproval.scopeDisplayName;
            }
            if ((i & 33554432) != 0) {
                approvalOrigin2 = agentPermissionApproval.origin;
            }
            if ((i & 67108864) != 0) {
                str26 = agentPermissionApproval.threadId;
            }
            if ((i & 134217728) != 0) {
                list3 = agentPermissionApproval.decisionOptions;
            }
            if ((i & 268435456) != 0) {
                agentPermissionRichPayload2 = agentPermissionApproval.richPayload;
            }
            if ((i & 536870912) != 0) {
                z6 = agentPermissionApproval.editableMessageAvailable;
            }
            if ((i & 1073741824) != 0) {
                l2 = agentPermissionApproval.messageRevision;
            }
            if ((i & Integer.MIN_VALUE) != 0) {
                bool2 = agentPermissionApproval.connectorTurnGrantEligible;
            }
            return agentPermissionApproval.copy(str17, z4, approvalAttentionMode2, j2, approvalRecord2, str18, str19, str20, str21, str22, str23, str24, str25, agentPermissionRequestPresentation2, agentPermissionRequestPreviewDocument2, z5, str27, list4, agentPermissionPayloadType2, str28, num2, str29, str30, str31, str32, approvalOrigin2, str26, list3, agentPermissionRichPayload2, z6, l2, bool2);
        }

        public /* synthetic */ AgentPermissionApproval(String str, boolean z, ApprovalAttentionMode approvalAttentionMode, long j, ApprovalRecord approvalRecord, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AgentPermissionRequestPresentation agentPermissionRequestPresentation, AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, boolean z2, String str10, List list, AgentPermissionPayloadType agentPermissionPayloadType, String str11, Integer num, String str12, String str13, String str14, String str15, ApprovalOrigin approvalOrigin, String str16, List list2, AgentPermissionRichPayload agentPermissionRichPayload, boolean z3, Long l, Boolean bool, int i, C06H c06h) {
            this(str, z, (i & 4) != 0 ? ApprovalAttentionMode.FOREGROUND : approvalAttentionMode, C3cH.A03(i & 8, j), (i & 16) != 0 ? null : approvalRecord, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, str5, str6, str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? AgentPermissionRequestPresentation.DETAILS : agentPermissionRequestPresentation, (i & 16384) != 0 ? null : agentPermissionRequestPreviewDocument, C3cH.A1L(32768, i, z2), (65536 & i) != 0 ? null : str10, list, agentPermissionPayloadType, str11, (1048576 & i) != 0 ? null : num, (2097152 & i) != 0 ? null : str12, (4194304 & i) != 0 ? null : str13, (8388608 & i) != 0 ? null : str14, (16777216 & i) != 0 ? null : str15, approvalOrigin, (67108864 & i) != 0 ? null : str16, (134217728 & i) != 0 ? C0881AGi.A00 : list2, (268435456 & i) != 0 ? null : agentPermissionRichPayload, C3cH.A1L(536870912, i, z3), (1073741824 & i) != 0 ? null : l, (i & Integer.MIN_VALUE) != 0 ? null : bool);
        }
    }

    public final class AgentPermissionApprovalDecision extends C06G {
        public static final int $stable = 0;
        public final String alwaysScope;
        public final String approvalId;
        public final String decisionKind;
        public final Long expectedMessageRevision;
        public final String reason;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionApprovalDecision) {
                    AgentPermissionApprovalDecision agentPermissionApprovalDecision = (AgentPermissionApprovalDecision) obj;
                    if (!C7384Etj.areEqual(this.approvalId, agentPermissionApprovalDecision.approvalId) || !C7384Etj.areEqual(this.decisionKind, agentPermissionApprovalDecision.decisionKind) || !C7384Etj.areEqual(this.alwaysScope, agentPermissionApprovalDecision.alwaysScope) || !C7384Etj.areEqual(this.reason, agentPermissionApprovalDecision.reason) || !C7384Etj.areEqual(this.expectedMessageRevision, agentPermissionApprovalDecision.expectedMessageRevision)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionApprovalDecision copy$default(AgentPermissionApprovalDecision agentPermissionApprovalDecision, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentPermissionApprovalDecision.approvalId;
            }
            if ((i & 2) != 0) {
                str2 = agentPermissionApprovalDecision.decisionKind;
            }
            if ((i & 4) != 0) {
                str3 = agentPermissionApprovalDecision.alwaysScope;
            }
            if ((i & 8) != 0) {
                str4 = agentPermissionApprovalDecision.reason;
            }
            if ((i & 16) != 0) {
                l = agentPermissionApprovalDecision.expectedMessageRevision;
            }
            return agentPermissionApprovalDecision.copy(str, str2, str3, str4, l);
        }

        public final String component1() {
            return this.approvalId;
        }

        public final String component2() {
            return this.decisionKind;
        }

        public final String component3() {
            return this.alwaysScope;
        }

        public final String component4() {
            return this.reason;
        }

        public final Long component5() {
            return this.expectedMessageRevision;
        }

        public final String getAlwaysScope() {
            return this.alwaysScope;
        }

        public final String getApprovalId() {
            return this.approvalId;
        }

        public final String getDecisionKind() {
            return this.decisionKind;
        }

        public final Long getExpectedMessageRevision() {
            return this.expectedMessageRevision;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0I(this.decisionKind, AnonymousClass001.A0G(this.approvalId)) + AnonymousClass006.A0G(this.alwaysScope)) * 31) + AnonymousClass006.A0G(this.reason)) * 31) + C3cH.A02(this.expectedMessageRevision);
        }

        public AgentPermissionApprovalDecision(String str, String str2, String str3, String str4, Long l) {
            AnonymousClass003.A0u(str, str2);
            this.approvalId = str;
            this.decisionKind = str2;
            this.alwaysScope = str3;
            this.reason = str4;
            this.expectedMessageRevision = l;
        }

        public final AgentPermissionApprovalDecision copy(String str, String str2, String str3, String str4, Long l) {
            AnonymousClass003.A0u(str, str2);
            return new AgentPermissionApprovalDecision(str, str2, str3, str4, l);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ AgentPermissionApprovalDecision(String str, String str2, String str3, String str4, Long l, int i, C06H c06h) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l);
        }
    }

    /* loaded from: classes.dex */
    public final class AgentPermissionDetailRow extends C06G {
        public static final int $stable = 0;
        public final String label;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionDetailRow) {
                    AgentPermissionDetailRow agentPermissionDetailRow = (AgentPermissionDetailRow) obj;
                    if (!C7384Etj.areEqual(this.label, agentPermissionDetailRow.label) || !C7384Etj.areEqual(this.value, agentPermissionDetailRow.value)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionDetailRow copy$default(AgentPermissionDetailRow agentPermissionDetailRow, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentPermissionDetailRow.label;
            }
            if ((i & 2) != 0) {
                str2 = agentPermissionDetailRow.value;
            }
            AnonymousClass003.A0u(str, str2);
            return new AgentPermissionDetailRow(str, str2);
        }

        public final String component1() {
            return this.label;
        }

        public final String component2() {
            return this.value;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.label));
        }

        public AgentPermissionDetailRow(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.label = str;
            this.value = str2;
        }

        public final AgentPermissionDetailRow copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new AgentPermissionDetailRow(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class AgentPermissionRequestPreviewAttachment extends C06G {
        public static final int $stable = 0;
        public final String fileName;
        public final AgentPermissionRequestPreviewAttachmentKind kind;
        public final AgentPermissionRequestPreviewAttachmentResource resource;
        public final Long sizeBytes;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionRequestPreviewAttachment) {
                    AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment = (AgentPermissionRequestPreviewAttachment) obj;
                    if (this.kind != agentPermissionRequestPreviewAttachment.kind || !C7384Etj.areEqual(this.fileName, agentPermissionRequestPreviewAttachment.fileName) || !C7384Etj.areEqual(this.sizeBytes, agentPermissionRequestPreviewAttachment.sizeBytes) || !C7384Etj.areEqual(this.resource, agentPermissionRequestPreviewAttachment.resource)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionRequestPreviewAttachment copy$default(AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind, String str, Long l, AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource, int i, Object obj) {
            if ((i & 1) != 0) {
                agentPermissionRequestPreviewAttachmentKind = agentPermissionRequestPreviewAttachment.kind;
            }
            if ((i & 2) != 0) {
                str = agentPermissionRequestPreviewAttachment.fileName;
            }
            if ((i & 4) != 0) {
                l = agentPermissionRequestPreviewAttachment.sizeBytes;
            }
            if ((i & 8) != 0) {
                agentPermissionRequestPreviewAttachmentResource = agentPermissionRequestPreviewAttachment.resource;
            }
            AnonymousClass003.A0u(agentPermissionRequestPreviewAttachmentKind, str);
            return new AgentPermissionRequestPreviewAttachment(agentPermissionRequestPreviewAttachmentKind, str, l, agentPermissionRequestPreviewAttachmentResource);
        }

        public final AgentPermissionRequestPreviewAttachmentKind component1() {
            return this.kind;
        }

        public final String component2() {
            return this.fileName;
        }

        public final Long component3() {
            return this.sizeBytes;
        }

        public final AgentPermissionRequestPreviewAttachmentResource component4() {
            return this.resource;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final AgentPermissionRequestPreviewAttachmentKind getKind() {
            return this.kind;
        }

        public final AgentPermissionRequestPreviewAttachmentResource getResource() {
            return this.resource;
        }

        public final Long getSizeBytes() {
            return this.sizeBytes;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0I(this.fileName, AnonymousClass005.A0E(this.kind)) + AnonymousClass006.A0D(this.sizeBytes)) * 31) + C3cH.A02(this.resource);
        }

        public AgentPermissionRequestPreviewAttachment(AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind, String str, Long l, AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource) {
            AnonymousClass003.A0u(agentPermissionRequestPreviewAttachmentKind, str);
            this.kind = agentPermissionRequestPreviewAttachmentKind;
            this.fileName = str;
            this.sizeBytes = l;
            this.resource = agentPermissionRequestPreviewAttachmentResource;
        }

        public final AgentPermissionRequestPreviewAttachment copy(AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind, String str, Long l, AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource) {
            AnonymousClass003.A0u(agentPermissionRequestPreviewAttachmentKind, str);
            return new AgentPermissionRequestPreviewAttachment(agentPermissionRequestPreviewAttachmentKind, str, l, agentPermissionRequestPreviewAttachmentResource);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AgentPermissionRequestPreviewAttachmentKind {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AgentPermissionRequestPreviewAttachmentKind[] $VALUES;
        public static final AgentPermissionRequestPreviewAttachmentKind FILE;
        public static final AgentPermissionRequestPreviewAttachmentKind IMAGE;
        public static final AgentPermissionRequestPreviewAttachmentKind VIDEO;

        static {
            AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind = new AgentPermissionRequestPreviewAttachmentKind("IMAGE", 0);
            IMAGE = agentPermissionRequestPreviewAttachmentKind;
            AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind2 = new AgentPermissionRequestPreviewAttachmentKind("VIDEO", 1);
            VIDEO = agentPermissionRequestPreviewAttachmentKind2;
            AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind3 = new AgentPermissionRequestPreviewAttachmentKind("FILE", 2);
            FILE = agentPermissionRequestPreviewAttachmentKind3;
            AgentPermissionRequestPreviewAttachmentKind[] agentPermissionRequestPreviewAttachmentKindArr = {agentPermissionRequestPreviewAttachmentKind, agentPermissionRequestPreviewAttachmentKind2, agentPermissionRequestPreviewAttachmentKind3};
            $VALUES = agentPermissionRequestPreviewAttachmentKindArr;
            $ENTRIES = C3cG.A0w(agentPermissionRequestPreviewAttachmentKindArr);
        }

        public static Ey9<AgentPermissionRequestPreviewAttachmentKind> getEntries() {
            return $ENTRIES;
        }

        public static AgentPermissionRequestPreviewAttachmentKind valueOf(String str) {
            return (AgentPermissionRequestPreviewAttachmentKind) Enum.valueOf(AgentPermissionRequestPreviewAttachmentKind.class, str);
        }

        public static AgentPermissionRequestPreviewAttachmentKind[] values() {
            return (AgentPermissionRequestPreviewAttachmentKind[]) $VALUES.clone();
        }

        public AgentPermissionRequestPreviewAttachmentKind(String str, int i) {
        }
    }

    public final class AgentPermissionRequestPreviewAttachmentResource extends C06G {
        public static final int $stable = 0;
        public final String contentType;
        public final Integer height;
        public final Long updatedAtMs;
        public final String url;
        public final Integer width;

        public AgentPermissionRequestPreviewAttachmentResource(String str, Integer num, Integer num2, String str2, Long l) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
            this.width = num;
            this.height = num2;
            this.contentType = str2;
            this.updatedAtMs = l;
        }

        public final AgentPermissionRequestPreviewAttachmentResource copy(String str, Integer num, Integer num2, String str2, Long l) {
            C7384Etj.A0Y(str, 0);
            return new AgentPermissionRequestPreviewAttachmentResource(str, num, num2, str2, l);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionRequestPreviewAttachmentResource) {
                    AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource = (AgentPermissionRequestPreviewAttachmentResource) obj;
                    if (!C7384Etj.areEqual(this.url, agentPermissionRequestPreviewAttachmentResource.url) || !C7384Etj.areEqual(this.width, agentPermissionRequestPreviewAttachmentResource.width) || !C7384Etj.areEqual(this.height, agentPermissionRequestPreviewAttachmentResource.height) || !C7384Etj.areEqual(this.contentType, agentPermissionRequestPreviewAttachmentResource.contentType) || !C7384Etj.areEqual(this.updatedAtMs, agentPermissionRequestPreviewAttachmentResource.updatedAtMs)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionRequestPreviewAttachmentResource copy$default(AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource, String str, Integer num, Integer num2, String str2, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentPermissionRequestPreviewAttachmentResource.url;
            }
            if ((i & 2) != 0) {
                num = agentPermissionRequestPreviewAttachmentResource.width;
            }
            if ((i & 4) != 0) {
                num2 = agentPermissionRequestPreviewAttachmentResource.height;
            }
            if ((i & 8) != 0) {
                str2 = agentPermissionRequestPreviewAttachmentResource.contentType;
            }
            if ((i & 16) != 0) {
                l = agentPermissionRequestPreviewAttachmentResource.updatedAtMs;
            }
            return agentPermissionRequestPreviewAttachmentResource.copy(str, num, num2, str2, l);
        }

        public final String component1() {
            return this.url;
        }

        public final Integer component2() {
            return this.width;
        }

        public final Integer component3() {
            return this.height;
        }

        public final String component4() {
            return this.contentType;
        }

        public final Long component5() {
            return this.updatedAtMs;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            return ((((((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + AnonymousClass006.A0G(this.contentType)) * 31) + C3cH.A02(this.updatedAtMs);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface AgentPermissionRequestPreviewBlock {

        public final class Attachments extends C06G implements AgentPermissionRequestPreviewBlock {
            public static final int $stable = 8;
            public final List<AgentPermissionRequestPreviewAttachment> items;
            public final String key;
            public final String label;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Attachments) {
                        Attachments attachments = (Attachments) obj;
                        if (!C7384Etj.areEqual(this.key, attachments.key) || !C7384Etj.areEqual(this.label, attachments.label) || !C7384Etj.areEqual(this.items, attachments.items)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Attachments copy$default(Attachments attachments, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = attachments.key;
                }
                if ((i & 2) != 0) {
                    str2 = attachments.label;
                }
                if ((i & 4) != 0) {
                    list = attachments.items;
                }
                return attachments.copy(str, str2, list);
            }

            public final String component1() {
                return this.key;
            }

            public final String component2() {
                return this.label;
            }

            public final List<AgentPermissionRequestPreviewAttachment> component3() {
                return this.items;
            }

            public final List<AgentPermissionRequestPreviewAttachment> getItems() {
                return this.items;
            }

            public final String getKey() {
                return this.key;
            }

            public final String getLabel() {
                return this.label;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.items, (AnonymousClass001.A0G(this.key) + AnonymousClass006.A0G(this.label)) * 31);
            }

            public Attachments(String str, String str2, List<AgentPermissionRequestPreviewAttachment> list) {
                AnonymousClass003.A0v(str, list);
                this.key = str;
                this.label = str2;
                this.items = list;
            }

            public final Attachments copy(String str, String str2, List<AgentPermissionRequestPreviewAttachment> list) {
                AnonymousClass003.A0v(str, list);
                return new Attachments(str, str2, list);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Fields extends C06G implements AgentPermissionRequestPreviewBlock {
            public static final int $stable = 8;
            public final List<AgentPermissionRequestPreviewField> rows;

            public Fields(List<AgentPermissionRequestPreviewField> list) {
                C7384Etj.A0Y(list, 0);
                this.rows = list;
            }

            public final Fields copy(List<AgentPermissionRequestPreviewField> list) {
                C7384Etj.A0Y(list, 0);
                return new Fields(list);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Fields) && C7384Etj.areEqual(this.rows, ((Fields) obj).rows));
            }

            public static /* synthetic */ Fields copy$default(Fields fields, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = fields.rows;
                }
                C7384Etj.A0Y(list, 0);
                return new Fields(list);
            }

            public final List<AgentPermissionRequestPreviewField> component1() {
                return this.rows;
            }

            public final List<AgentPermissionRequestPreviewField> getRows() {
                return this.rows;
            }

            public int hashCode() {
                return this.rows.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class ItemList extends C06G implements AgentPermissionRequestPreviewBlock {
            public static final int $stable = 8;
            public final List<String> items;
            public final String key;
            public final String label;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof ItemList) {
                        ItemList itemList = (ItemList) obj;
                        if (!C7384Etj.areEqual(this.key, itemList.key) || !C7384Etj.areEqual(this.label, itemList.label) || !C7384Etj.areEqual(this.items, itemList.items)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ItemList copy$default(ItemList itemList, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = itemList.key;
                }
                if ((i & 2) != 0) {
                    str2 = itemList.label;
                }
                if ((i & 4) != 0) {
                    list = itemList.items;
                }
                return itemList.copy(str, str2, list);
            }

            public final String component1() {
                return this.key;
            }

            public final String component2() {
                return this.label;
            }

            public final List<String> component3() {
                return this.items;
            }

            public final List<String> getItems() {
                return this.items;
            }

            public final String getKey() {
                return this.key;
            }

            public final String getLabel() {
                return this.label;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.items, (AnonymousClass001.A0G(this.key) + AnonymousClass006.A0G(this.label)) * 31);
            }

            public ItemList(String str, String str2, List<String> list) {
                AnonymousClass003.A0v(str, list);
                this.key = str;
                this.label = str2;
                this.items = list;
            }

            public final ItemList copy(String str, String str2, List<String> list) {
                AnonymousClass003.A0v(str, list);
                return new ItemList(str, str2, list);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Links extends C06G implements AgentPermissionRequestPreviewBlock {
            public static final int $stable = 8;
            public final List<AgentPermissionRequestPreviewLink> items;
            public final String key;
            public final String label;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Links) {
                        Links links = (Links) obj;
                        if (!C7384Etj.areEqual(this.key, links.key) || !C7384Etj.areEqual(this.label, links.label) || !C7384Etj.areEqual(this.items, links.items)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Links copy$default(Links links, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = links.key;
                }
                if ((i & 2) != 0) {
                    str2 = links.label;
                }
                if ((i & 4) != 0) {
                    list = links.items;
                }
                return links.copy(str, str2, list);
            }

            public final String component1() {
                return this.key;
            }

            public final String component2() {
                return this.label;
            }

            public final List<AgentPermissionRequestPreviewLink> component3() {
                return this.items;
            }

            public final List<AgentPermissionRequestPreviewLink> getItems() {
                return this.items;
            }

            public final String getKey() {
                return this.key;
            }

            public final String getLabel() {
                return this.label;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.items, (AnonymousClass001.A0G(this.key) + AnonymousClass006.A0G(this.label)) * 31);
            }

            public Links(String str, String str2, List<AgentPermissionRequestPreviewLink> list) {
                AnonymousClass003.A0v(str, list);
                this.key = str;
                this.label = str2;
                this.items = list;
            }

            public final Links copy(String str, String str2, List<AgentPermissionRequestPreviewLink> list) {
                AnonymousClass003.A0v(str, list);
                return new Links(str, str2, list);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Text extends C06G implements AgentPermissionRequestPreviewBlock {
            public static final int $stable = 0;
            public final String key;
            public final String label;
            public final String text;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Text) {
                        Text text = (Text) obj;
                        if (!C7384Etj.areEqual(this.key, text.key) || !C7384Etj.areEqual(this.label, text.label) || !C7384Etj.areEqual(this.text, text.text)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.key;
                }
                if ((i & 2) != 0) {
                    str2 = text.label;
                }
                if ((i & 4) != 0) {
                    str3 = text.text;
                }
                return text.copy(str, str2, str3);
            }

            public final String component1() {
                return this.key;
            }

            public final String component2() {
                return this.label;
            }

            public final String component3() {
                return this.text;
            }

            public final String getKey() {
                return this.key;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return AnonymousClass001.A0H(this.text, (AnonymousClass001.A0G(this.key) + AnonymousClass006.A0G(this.label)) * 31);
            }

            public Text(String str, String str2, String str3) {
                AnonymousClass003.A0v(str, str3);
                this.key = str;
                this.label = str2;
                this.text = str3;
            }

            public final Text copy(String str, String str2, String str3) {
                AnonymousClass003.A0v(str, str3);
                return new Text(str, str2, str3);
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    /* loaded from: classes.dex */
    public final class AgentPermissionRequestPreviewDocument extends C06G {
        public static final int $stable = 8;
        public final List<AgentPermissionRequestPreviewBlock> blocks;
        public final boolean truncated;

        /* JADX WARN: Multi-variable type inference failed */
        public AgentPermissionRequestPreviewDocument(boolean z, List<? extends AgentPermissionRequestPreviewBlock> list) {
            C7384Etj.A0Y(list, 1);
            this.truncated = z;
            this.blocks = list;
        }

        public final AgentPermissionRequestPreviewDocument copy(boolean z, List<? extends AgentPermissionRequestPreviewBlock> list) {
            C7384Etj.A0Y(list, 1);
            return new AgentPermissionRequestPreviewDocument(z, list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionRequestPreviewDocument) {
                    AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument = (AgentPermissionRequestPreviewDocument) obj;
                    if (this.truncated != agentPermissionRequestPreviewDocument.truncated || !C7384Etj.areEqual(this.blocks, agentPermissionRequestPreviewDocument.blocks)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionRequestPreviewDocument copy$default(AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = agentPermissionRequestPreviewDocument.truncated;
            }
            if ((i & 2) != 0) {
                list = agentPermissionRequestPreviewDocument.blocks;
            }
            C7384Etj.A0Y(list, 1);
            return new AgentPermissionRequestPreviewDocument(z, list);
        }

        public final boolean component1() {
            return this.truncated;
        }

        public final List<AgentPermissionRequestPreviewBlock> component2() {
            return this.blocks;
        }

        public final List<AgentPermissionRequestPreviewBlock> getBlocks() {
            return this.blocks;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.blocks, C0KA.A02(this.truncated));
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class AgentPermissionRequestPreviewField extends C06G {
        public static final int $stable = 0;
        public final String key;
        public final String label;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionRequestPreviewField) {
                    AgentPermissionRequestPreviewField agentPermissionRequestPreviewField = (AgentPermissionRequestPreviewField) obj;
                    if (!C7384Etj.areEqual(this.label, agentPermissionRequestPreviewField.label) || !C7384Etj.areEqual(this.value, agentPermissionRequestPreviewField.value) || !C7384Etj.areEqual(this.key, agentPermissionRequestPreviewField.key)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionRequestPreviewField copy$default(AgentPermissionRequestPreviewField agentPermissionRequestPreviewField, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentPermissionRequestPreviewField.label;
            }
            if ((i & 2) != 0) {
                str2 = agentPermissionRequestPreviewField.value;
            }
            if ((i & 4) != 0) {
                str3 = agentPermissionRequestPreviewField.key;
            }
            return agentPermissionRequestPreviewField.copy(str, str2, str3);
        }

        public final String component1() {
            return this.label;
        }

        public final String component2() {
            return this.value;
        }

        public final String component3() {
            return this.key;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.value, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0G(this.key);
        }

        public AgentPermissionRequestPreviewField(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.label = str;
            this.value = str2;
            this.key = str3;
        }

        public final AgentPermissionRequestPreviewField copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new AgentPermissionRequestPreviewField(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ AgentPermissionRequestPreviewField(String str, String str2, String str3, int i, C06H c06h) {
            this(str, str2, AnonymousClass006.A0t(i, str3));
        }
    }

    /* loaded from: classes.dex */
    public final class AgentPermissionRequestPreviewLink extends C06G {
        public static final int $stable = 0;
        public final String label;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentPermissionRequestPreviewLink) {
                    AgentPermissionRequestPreviewLink agentPermissionRequestPreviewLink = (AgentPermissionRequestPreviewLink) obj;
                    if (!C7384Etj.areEqual(this.label, agentPermissionRequestPreviewLink.label) || !C7384Etj.areEqual(this.url, agentPermissionRequestPreviewLink.url)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentPermissionRequestPreviewLink copy$default(AgentPermissionRequestPreviewLink agentPermissionRequestPreviewLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentPermissionRequestPreviewLink.label;
            }
            if ((i & 2) != 0) {
                str2 = agentPermissionRequestPreviewLink.url;
            }
            AnonymousClass003.A0u(str, str2);
            return new AgentPermissionRequestPreviewLink(str, str2);
        }

        public final String component1() {
            return this.label;
        }

        public final String component2() {
            return this.url;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.label));
        }

        public AgentPermissionRequestPreviewLink(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.label = str;
            this.url = str2;
        }

        public final AgentPermissionRequestPreviewLink copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new AgentPermissionRequestPreviewLink(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface AgentPermissionRichPayload {
    }

    public final class BrowserCheckoutApproval extends C06G implements CheckoutApprovalPayload {
        public static final int $stable = 8;
        public final String amount;
        public final String browserTaskId;
        public final String cardBrand;
        public final Long cardExpiresInMs;
        public final String cardLast4;
        public final String currency;
        public final String merchantUrl;
        public final Boolean networkTokenEligible;
        public final String paymentMethodLabel;
        public final List<WalletPaymentOption> paymentOptions;
        public final CheckoutPaymentSelection paymentSelection;
        public final CheckoutScreenshot screenshot;
        public final CheckoutTab tab;
        public final int version;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BrowserCheckoutApproval) {
                    BrowserCheckoutApproval browserCheckoutApproval = (BrowserCheckoutApproval) obj;
                    if (this.version != browserCheckoutApproval.version || !C7384Etj.areEqual(this.merchantUrl, browserCheckoutApproval.merchantUrl) || !C7384Etj.areEqual(this.paymentMethodLabel, browserCheckoutApproval.paymentMethodLabel) || !C7384Etj.areEqual(this.cardBrand, browserCheckoutApproval.cardBrand) || !C7384Etj.areEqual(this.cardLast4, browserCheckoutApproval.cardLast4) || !C7384Etj.areEqual(this.amount, browserCheckoutApproval.amount) || !C7384Etj.areEqual(this.currency, browserCheckoutApproval.currency) || !C7384Etj.areEqual(this.cardExpiresInMs, browserCheckoutApproval.cardExpiresInMs) || !C7384Etj.areEqual(this.tab, browserCheckoutApproval.tab) || !C7384Etj.areEqual(this.screenshot, browserCheckoutApproval.screenshot) || !C7384Etj.areEqual(this.browserTaskId, browserCheckoutApproval.browserTaskId) || !C7384Etj.areEqual(this.paymentSelection, browserCheckoutApproval.paymentSelection) || !C7384Etj.areEqual(this.paymentOptions, browserCheckoutApproval.paymentOptions) || !C7384Etj.areEqual(this.networkTokenEligible, browserCheckoutApproval.networkTokenEligible)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ BrowserCheckoutApproval(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTab checkoutTab, CheckoutScreenshot checkoutScreenshot, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List list, Boolean bool, int i2, C06H c06h) {
            this(i, str, str2, str3, str4, str5, str6, l, checkoutTab, checkoutScreenshot, str7, (i2 & 2048) != 0 ? null : checkoutPaymentSelection, (i2 & 4096) != 0 ? C0881AGi.A00 : list, (i2 & 8192) != 0 ? null : bool);
        }

        public static /* synthetic */ BrowserCheckoutApproval copy$default(BrowserCheckoutApproval browserCheckoutApproval, int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTab checkoutTab, CheckoutScreenshot checkoutScreenshot, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List list, Boolean bool, int i2, Object obj) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            Long l2 = l;
            CheckoutTab checkoutTab2 = checkoutTab;
            CheckoutScreenshot checkoutScreenshot2 = checkoutScreenshot;
            String str14 = str7;
            CheckoutPaymentSelection checkoutPaymentSelection2 = checkoutPaymentSelection;
            List list2 = list;
            Boolean bool2 = bool;
            if ((i2 & 1) != 0) {
                i = browserCheckoutApproval.version;
            }
            if ((i2 & 2) != 0) {
                str8 = browserCheckoutApproval.merchantUrl;
            }
            if ((i2 & 4) != 0) {
                str9 = browserCheckoutApproval.paymentMethodLabel;
            }
            if ((i2 & 8) != 0) {
                str10 = browserCheckoutApproval.cardBrand;
            }
            if ((i2 & 16) != 0) {
                str11 = browserCheckoutApproval.cardLast4;
            }
            if ((i2 & 32) != 0) {
                str12 = browserCheckoutApproval.amount;
            }
            if ((i2 & 64) != 0) {
                str13 = browserCheckoutApproval.currency;
            }
            if ((i2 & 128) != 0) {
                l2 = browserCheckoutApproval.cardExpiresInMs;
            }
            if ((i2 & 256) != 0) {
                checkoutTab2 = browserCheckoutApproval.tab;
            }
            if ((i2 & 512) != 0) {
                checkoutScreenshot2 = browserCheckoutApproval.screenshot;
            }
            if ((i2 & 1024) != 0) {
                str14 = browserCheckoutApproval.browserTaskId;
            }
            if ((i2 & 2048) != 0) {
                checkoutPaymentSelection2 = browserCheckoutApproval.paymentSelection;
            }
            if ((i2 & 4096) != 0) {
                list2 = browserCheckoutApproval.paymentOptions;
            }
            if ((i2 & 8192) != 0) {
                bool2 = browserCheckoutApproval.networkTokenEligible;
            }
            return browserCheckoutApproval.copy(i, str8, str9, str10, str11, str12, str13, l2, checkoutTab2, checkoutScreenshot2, str14, checkoutPaymentSelection2, list2, bool2);
        }

        public final int component1() {
            return this.version;
        }

        public final CheckoutScreenshot component10() {
            return this.screenshot;
        }

        public final String component11() {
            return this.browserTaskId;
        }

        public final CheckoutPaymentSelection component12() {
            return this.paymentSelection;
        }

        public final List<WalletPaymentOption> component13() {
            return this.paymentOptions;
        }

        public final Boolean component14() {
            return this.networkTokenEligible;
        }

        public final String component2() {
            return this.merchantUrl;
        }

        public final String component3() {
            return this.paymentMethodLabel;
        }

        public final String component4() {
            return this.cardBrand;
        }

        public final String component5() {
            return this.cardLast4;
        }

        public final String component6() {
            return this.amount;
        }

        public final String component7() {
            return this.currency;
        }

        public final Long component8() {
            return this.cardExpiresInMs;
        }

        public final CheckoutTab component9() {
            return this.tab;
        }

        public final BrowserCheckoutApproval copy(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTab checkoutTab, CheckoutScreenshot checkoutScreenshot, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list, Boolean bool) {
            C7384Etj.A0Y(list, 12);
            return new BrowserCheckoutApproval(i, str, str2, str3, str4, str5, str6, l, checkoutTab, checkoutScreenshot, str7, checkoutPaymentSelection, list, bool);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getBrowserTaskId() {
            return this.browserTaskId;
        }

        public final String getCardBrand() {
            return this.cardBrand;
        }

        public final Long getCardExpiresInMs() {
            return this.cardExpiresInMs;
        }

        public final String getCardLast4() {
            return this.cardLast4;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getMerchantUrl() {
            return this.merchantUrl;
        }

        public final Boolean getNetworkTokenEligible() {
            return this.networkTokenEligible;
        }

        public final String getPaymentMethodLabel() {
            return this.paymentMethodLabel;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public List<WalletPaymentOption> getPaymentOptions() {
            return this.paymentOptions;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public CheckoutPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final CheckoutScreenshot getScreenshot() {
            return this.screenshot;
        }

        public final CheckoutTab getTab() {
            return this.tab;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.paymentOptions, ((((((((((((((((((((((this.version * 31) + AnonymousClass006.A0G(this.merchantUrl)) * 31) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0D(this.cardExpiresInMs)) * 31) + AnonymousClass006.A0D(this.tab)) * 31) + AnonymousClass006.A0D(this.screenshot)) * 31) + AnonymousClass006.A0G(this.browserTaskId)) * 31) + AnonymousClass006.A0D(this.paymentSelection)) * 31) + C3cH.A02(this.networkTokenEligible);
        }

        public String toString() {
            return super.toString();
        }

        public BrowserCheckoutApproval(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutTab checkoutTab, CheckoutScreenshot checkoutScreenshot, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list, Boolean bool) {
            C7384Etj.A0Y(list, 12);
            this.version = i;
            this.merchantUrl = str;
            this.paymentMethodLabel = str2;
            this.cardBrand = str3;
            this.cardLast4 = str4;
            this.amount = str5;
            this.currency = str6;
            this.cardExpiresInMs = l;
            this.tab = checkoutTab;
            this.screenshot = checkoutScreenshot;
            this.browserTaskId = str7;
            this.paymentSelection = checkoutPaymentSelection;
            this.paymentOptions = list;
            this.networkTokenEligible = bool;
        }
    }

    public final class BrowserTaskConfirmationApproval extends C06G implements AgentPermissionRichPayload {
        public static final int $stable = 0;
        public final String body;
        public final String browserActionLabel;
        public final String browserTaskId;
        public final String title;

        public BrowserTaskConfirmationApproval(String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str4, 3);
            this.title = str;
            this.body = str2;
            this.browserActionLabel = str3;
            this.browserTaskId = str4;
        }

        public final BrowserTaskConfirmationApproval copy(String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str4, 3);
            return new BrowserTaskConfirmationApproval(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BrowserTaskConfirmationApproval) {
                    BrowserTaskConfirmationApproval browserTaskConfirmationApproval = (BrowserTaskConfirmationApproval) obj;
                    if (!C7384Etj.areEqual(this.title, browserTaskConfirmationApproval.title) || !C7384Etj.areEqual(this.body, browserTaskConfirmationApproval.body) || !C7384Etj.areEqual(this.browserActionLabel, browserTaskConfirmationApproval.browserActionLabel) || !C7384Etj.areEqual(this.browserTaskId, browserTaskConfirmationApproval.browserTaskId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ BrowserTaskConfirmationApproval copy$default(BrowserTaskConfirmationApproval browserTaskConfirmationApproval, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserTaskConfirmationApproval.title;
            }
            if ((i & 2) != 0) {
                str2 = browserTaskConfirmationApproval.body;
            }
            if ((i & 4) != 0) {
                str3 = browserTaskConfirmationApproval.browserActionLabel;
            }
            if ((i & 8) != 0) {
                str4 = browserTaskConfirmationApproval.browserTaskId;
            }
            C7384Etj.A0Y(str4, 3);
            return new BrowserTaskConfirmationApproval(str, str2, str3, str4);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.body;
        }

        public final String component3() {
            return this.browserActionLabel;
        }

        public final String component4() {
            return this.browserTaskId;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getBrowserActionLabel() {
            return this.browserActionLabel;
        }

        public final String getBrowserTaskId() {
            return this.browserTaskId;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.browserTaskId, ((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.body)) * 31) + AnonymousClass005.A0H(this.browserActionLabel)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CarRentalReservationApproval extends C06G implements AgentPermissionRichPayload {
        public static final int $stable = 8;
        public final BigDecimal amount;
        public final String category;
        public final Currency currency;
        public final String driverName;
        public final CarRentalReservationStop dropoff;
        public final boolean isPostpaid;
        public final List<CarRentalReservationLegalLink> legalLinks;
        public final CarRentalReservationStop pickup;
        public final Integer seats;
        public final String supplierName;
        public final String transmission;
        public final String vehicleName;
        public final int version;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CarRentalReservationApproval) {
                    CarRentalReservationApproval carRentalReservationApproval = (CarRentalReservationApproval) obj;
                    if (this.version != carRentalReservationApproval.version || !C7384Etj.areEqual(this.supplierName, carRentalReservationApproval.supplierName) || !C7384Etj.areEqual(this.vehicleName, carRentalReservationApproval.vehicleName) || !C7384Etj.areEqual(this.category, carRentalReservationApproval.category) || !C7384Etj.areEqual(this.transmission, carRentalReservationApproval.transmission) || !C7384Etj.areEqual(this.seats, carRentalReservationApproval.seats) || !C7384Etj.areEqual(this.pickup, carRentalReservationApproval.pickup) || !C7384Etj.areEqual(this.dropoff, carRentalReservationApproval.dropoff) || !C7384Etj.areEqual(this.amount, carRentalReservationApproval.amount) || !C7384Etj.areEqual(this.currency, carRentalReservationApproval.currency) || this.isPostpaid != carRentalReservationApproval.isPostpaid || !C7384Etj.areEqual(this.driverName, carRentalReservationApproval.driverName) || !C7384Etj.areEqual(this.legalLinks, carRentalReservationApproval.legalLinks)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CarRentalReservationApproval copy$default(CarRentalReservationApproval carRentalReservationApproval, int i, String str, String str2, String str3, String str4, Integer num, CarRentalReservationStop carRentalReservationStop, CarRentalReservationStop carRentalReservationStop2, BigDecimal bigDecimal, Currency currency, boolean z, String str5, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = carRentalReservationApproval.version;
            }
            if ((i2 & 2) != 0) {
                str = carRentalReservationApproval.supplierName;
            }
            if ((i2 & 4) != 0) {
                str2 = carRentalReservationApproval.vehicleName;
            }
            if ((i2 & 8) != 0) {
                str3 = carRentalReservationApproval.category;
            }
            if ((i2 & 16) != 0) {
                str4 = carRentalReservationApproval.transmission;
            }
            if ((i2 & 32) != 0) {
                num = carRentalReservationApproval.seats;
            }
            if ((i2 & 64) != 0) {
                carRentalReservationStop = carRentalReservationApproval.pickup;
            }
            if ((i2 & 128) != 0) {
                carRentalReservationStop2 = carRentalReservationApproval.dropoff;
            }
            if ((i2 & 256) != 0) {
                bigDecimal = carRentalReservationApproval.amount;
            }
            if ((i2 & 512) != 0) {
                currency = carRentalReservationApproval.currency;
            }
            if ((i2 & 1024) != 0) {
                z = carRentalReservationApproval.isPostpaid;
            }
            if ((i2 & 2048) != 0) {
                str5 = carRentalReservationApproval.driverName;
            }
            if ((i2 & 4096) != 0) {
                list = carRentalReservationApproval.legalLinks;
            }
            return carRentalReservationApproval.copy(i, str, str2, str3, str4, num, carRentalReservationStop, carRentalReservationStop2, bigDecimal, currency, z, str5, list);
        }

        public final int component1() {
            return this.version;
        }

        public final Currency component10() {
            return this.currency;
        }

        public final boolean component11() {
            return this.isPostpaid;
        }

        public final String component12() {
            return this.driverName;
        }

        public final List<CarRentalReservationLegalLink> component13() {
            return this.legalLinks;
        }

        public final String component2() {
            return this.supplierName;
        }

        public final String component3() {
            return this.vehicleName;
        }

        public final String component4() {
            return this.category;
        }

        public final String component5() {
            return this.transmission;
        }

        public final Integer component6() {
            return this.seats;
        }

        public final CarRentalReservationStop component7() {
            return this.pickup;
        }

        public final CarRentalReservationStop component8() {
            return this.dropoff;
        }

        public final BigDecimal component9() {
            return this.amount;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getCategory() {
            return this.category;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final String getDriverName() {
            return this.driverName;
        }

        public final CarRentalReservationStop getDropoff() {
            return this.dropoff;
        }

        public final List<CarRentalReservationLegalLink> getLegalLinks() {
            return this.legalLinks;
        }

        public final CarRentalReservationStop getPickup() {
            return this.pickup;
        }

        public final Integer getSeats() {
            return this.seats;
        }

        public final String getSupplierName() {
            return this.supplierName;
        }

        public final String getTransmission() {
            return this.transmission;
        }

        public final String getVehicleName() {
            return this.vehicleName;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.legalLinks, (C0KA.A01(AnonymousClass005.A0F(this.currency, AnonymousClass005.A0F(this.amount, AnonymousClass005.A0F(this.dropoff, AnonymousClass005.A0F(this.pickup, (((((AnonymousClass005.A0I(this.vehicleName, AnonymousClass005.A0I(this.supplierName, this.version * 31)) + AnonymousClass006.A0G(this.category)) * 31) + AnonymousClass006.A0G(this.transmission)) * 31) + AnonymousClass006.A0D(this.seats)) * 31)))), this.isPostpaid) + AnonymousClass005.A0H(this.driverName)) * 31);
        }

        public final boolean isPostpaid() {
            return this.isPostpaid;
        }

        public CarRentalReservationApproval(int i, String str, String str2, String str3, String str4, Integer num, CarRentalReservationStop carRentalReservationStop, CarRentalReservationStop carRentalReservationStop2, BigDecimal bigDecimal, Currency currency, boolean z, String str5, List<CarRentalReservationLegalLink> list) {
            AnonymousClass003.A0x(str, str2);
            AnonymousClass005.A13(carRentalReservationStop, carRentalReservationStop2, bigDecimal, 6);
            C7384Etj.A0Y(currency, 9);
            C7384Etj.A0Y(list, 12);
            this.version = i;
            this.supplierName = str;
            this.vehicleName = str2;
            this.category = str3;
            this.transmission = str4;
            this.seats = num;
            this.pickup = carRentalReservationStop;
            this.dropoff = carRentalReservationStop2;
            this.amount = bigDecimal;
            this.currency = currency;
            this.isPostpaid = z;
            this.driverName = str5;
            this.legalLinks = list;
        }

        public final CarRentalReservationApproval copy(int i, String str, String str2, String str3, String str4, Integer num, CarRentalReservationStop carRentalReservationStop, CarRentalReservationStop carRentalReservationStop2, BigDecimal bigDecimal, Currency currency, boolean z, String str5, List<CarRentalReservationLegalLink> list) {
            AnonymousClass003.A0x(str, str2);
            AnonymousClass005.A13(carRentalReservationStop, carRentalReservationStop2, bigDecimal, 6);
            C7384Etj.A0Y(currency, 9);
            C7384Etj.A0Y(list, 12);
            return new CarRentalReservationApproval(i, str, str2, str3, str4, num, carRentalReservationStop, carRentalReservationStop2, bigDecimal, currency, z, str5, list);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CarRentalReservationLegalLink extends C06G {
        public static final int $stable = 0;
        public final String title;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CarRentalReservationLegalLink) {
                    CarRentalReservationLegalLink carRentalReservationLegalLink = (CarRentalReservationLegalLink) obj;
                    if (!C7384Etj.areEqual(this.title, carRentalReservationLegalLink.title) || !C7384Etj.areEqual(this.url, carRentalReservationLegalLink.url)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CarRentalReservationLegalLink copy$default(CarRentalReservationLegalLink carRentalReservationLegalLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = carRentalReservationLegalLink.title;
            }
            if ((i & 2) != 0) {
                str2 = carRentalReservationLegalLink.url;
            }
            AnonymousClass003.A0u(str, str2);
            return new CarRentalReservationLegalLink(str, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.url;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.title));
        }

        public CarRentalReservationLegalLink(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.title = str;
            this.url = str2;
        }

        public final CarRentalReservationLegalLink copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new CarRentalReservationLegalLink(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CarRentalReservationStop extends C06G {
        public static final int $stable = 8;
        public final String address;
        public final LocalDate date;
        public final String locationName;
        public final LocalTime time;

        public CarRentalReservationStop(LocalDate localDate, LocalTime localTime, String str, String str2) {
            C7384Etj.A0Y(localDate, 0);
            this.date = localDate;
            this.time = localTime;
            this.locationName = str;
            this.address = str2;
        }

        public final CarRentalReservationStop copy(LocalDate localDate, LocalTime localTime, String str, String str2) {
            C7384Etj.A0Y(localDate, 0);
            return new CarRentalReservationStop(localDate, localTime, str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CarRentalReservationStop) {
                    CarRentalReservationStop carRentalReservationStop = (CarRentalReservationStop) obj;
                    if (!C7384Etj.areEqual(this.date, carRentalReservationStop.date) || !C7384Etj.areEqual(this.time, carRentalReservationStop.time) || !C7384Etj.areEqual(this.locationName, carRentalReservationStop.locationName) || !C7384Etj.areEqual(this.address, carRentalReservationStop.address)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CarRentalReservationStop copy$default(CarRentalReservationStop carRentalReservationStop, LocalDate localDate, LocalTime localTime, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                localDate = carRentalReservationStop.date;
            }
            if ((i & 2) != 0) {
                localTime = carRentalReservationStop.time;
            }
            if ((i & 4) != 0) {
                str = carRentalReservationStop.locationName;
            }
            if ((i & 8) != 0) {
                str2 = carRentalReservationStop.address;
            }
            C7384Etj.A0Y(localDate, 0);
            return new CarRentalReservationStop(localDate, localTime, str, str2);
        }

        public final LocalDate component1() {
            return this.date;
        }

        public final LocalTime component2() {
            return this.time;
        }

        public final String component3() {
            return this.locationName;
        }

        public final String component4() {
            return this.address;
        }

        public final String getAddress() {
            return this.address;
        }

        public final LocalDate getDate() {
            return this.date;
        }

        public final String getLocationName() {
            return this.locationName;
        }

        public final LocalTime getTime() {
            return this.time;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0E(this.date) + AnonymousClass006.A0D(this.time)) * 31) + AnonymousClass006.A0G(this.locationName)) * 31) + AnonymousClass005.A0H(this.address);
        }

        public String toString() {
            return super.toString();
        }
    }

    public interface CheckoutApprovalPayload extends AgentPermissionRichPayload {
        List<WalletPaymentOption> getPaymentOptions();

        CheckoutPaymentSelection getPaymentSelection();
    }

    public final class CheckoutLegalLink extends C06G {
        public static final int $stable = 0;
        public final String label;
        public final CheckoutLegalLinkRole role;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutLegalLink) {
                    CheckoutLegalLink checkoutLegalLink = (CheckoutLegalLink) obj;
                    if (!C7384Etj.areEqual(this.label, checkoutLegalLink.label) || !C7384Etj.areEqual(this.url, checkoutLegalLink.url) || this.role != checkoutLegalLink.role) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutLegalLink copy$default(CheckoutLegalLink checkoutLegalLink, String str, String str2, CheckoutLegalLinkRole checkoutLegalLinkRole, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkoutLegalLink.label;
            }
            if ((i & 2) != 0) {
                str2 = checkoutLegalLink.url;
            }
            if ((i & 4) != 0) {
                checkoutLegalLinkRole = checkoutLegalLink.role;
            }
            return new CheckoutLegalLink(str, str2, checkoutLegalLinkRole);
        }

        public final String component1() {
            return this.label;
        }

        public final String component2() {
            return this.url;
        }

        public final CheckoutLegalLinkRole component3() {
            return this.role;
        }

        public final CheckoutLegalLink copy(String str, String str2, CheckoutLegalLinkRole checkoutLegalLinkRole) {
            return new CheckoutLegalLink(str, str2, checkoutLegalLinkRole);
        }

        public final String getLabel() {
            return this.label;
        }

        public final CheckoutLegalLinkRole getRole() {
            return this.role;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.label) * 31) + AnonymousClass006.A0G(this.url)) * 31) + C3cH.A02(this.role);
        }

        public CheckoutLegalLink(String str, String str2, CheckoutLegalLinkRole checkoutLegalLinkRole) {
            this.label = str;
            this.url = str2;
            this.role = checkoutLegalLinkRole;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ CheckoutLegalLink(String str, String str2, CheckoutLegalLinkRole checkoutLegalLinkRole, int i, C06H c06h) {
            this(str, str2, (i & 4) != 0 ? null : checkoutLegalLinkRole);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CheckoutLegalLinkRole {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CheckoutLegalLinkRole[] $VALUES;
        public static final CheckoutLegalLinkRole CONDITIONS_OF_CARRIAGE;
        public static final Companion Companion;
        public static final CheckoutLegalLinkRole PRIVACY_STATEMENT;
        public static final CheckoutLegalLinkRole PROPERTY_DETAILS_AND_RESTRICTIONS;
        public static final CheckoutLegalLinkRole TERMS_OF_SERVICE;

        public final class Companion {
            public final CheckoutLegalLinkRole fromWire(String str) {
                if (str == null) {
                    return null;
                }
                switch (str.hashCode()) {
                    case -2143303914:
                        if (str.equals("property_details_and_restrictions")) {
                            return CheckoutLegalLinkRole.PROPERTY_DETAILS_AND_RESTRICTIONS;
                        }
                        return null;
                    case -2083367419:
                        if (str.equals("terms_of_service")) {
                            return CheckoutLegalLinkRole.TERMS_OF_SERVICE;
                        }
                        return null;
                    case -1729593992:
                        if (str.equals("privacy_statement")) {
                            return CheckoutLegalLinkRole.PRIVACY_STATEMENT;
                        }
                        return null;
                    case -115411339:
                        if (str.equals("conditions_of_carriage")) {
                            return CheckoutLegalLinkRole.CONDITIONS_OF_CARRIAGE;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        static {
            CheckoutLegalLinkRole checkoutLegalLinkRole = new CheckoutLegalLinkRole("PRIVACY_STATEMENT", 0);
            PRIVACY_STATEMENT = checkoutLegalLinkRole;
            CheckoutLegalLinkRole checkoutLegalLinkRole2 = new CheckoutLegalLinkRole("TERMS_OF_SERVICE", 1);
            TERMS_OF_SERVICE = checkoutLegalLinkRole2;
            CheckoutLegalLinkRole checkoutLegalLinkRole3 = new CheckoutLegalLinkRole("PROPERTY_DETAILS_AND_RESTRICTIONS", 2);
            PROPERTY_DETAILS_AND_RESTRICTIONS = checkoutLegalLinkRole3;
            CheckoutLegalLinkRole checkoutLegalLinkRole4 = new CheckoutLegalLinkRole("CONDITIONS_OF_CARRIAGE", 3);
            CONDITIONS_OF_CARRIAGE = checkoutLegalLinkRole4;
            CheckoutLegalLinkRole[] checkoutLegalLinkRoleArr = {checkoutLegalLinkRole, checkoutLegalLinkRole2, checkoutLegalLinkRole3, checkoutLegalLinkRole4};
            $VALUES = checkoutLegalLinkRoleArr;
            $ENTRIES = C3cG.A0w(checkoutLegalLinkRoleArr);
            Companion = new Companion();
        }

        public static Ey9<CheckoutLegalLinkRole> getEntries() {
            return $ENTRIES;
        }

        public static CheckoutLegalLinkRole valueOf(String str) {
            return (CheckoutLegalLinkRole) Enum.valueOf(CheckoutLegalLinkRole.class, str);
        }

        public static CheckoutLegalLinkRole[] values() {
            return (CheckoutLegalLinkRole[]) $VALUES.clone();
        }

        public CheckoutLegalLinkRole(String str, int i) {
        }
    }

    public final class CheckoutMerchant extends C06G {
        public static final int $stable = 0;
        public final String iconUrl;
        public final String name;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutMerchant) {
                    CheckoutMerchant checkoutMerchant = (CheckoutMerchant) obj;
                    if (!C7384Etj.areEqual(this.name, checkoutMerchant.name) || !C7384Etj.areEqual(this.url, checkoutMerchant.url) || !C7384Etj.areEqual(this.iconUrl, checkoutMerchant.iconUrl)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutMerchant copy$default(CheckoutMerchant checkoutMerchant, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkoutMerchant.name;
            }
            if ((i & 2) != 0) {
                str2 = checkoutMerchant.url;
            }
            if ((i & 4) != 0) {
                str3 = checkoutMerchant.iconUrl;
            }
            return new CheckoutMerchant(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.url;
        }

        public final String component3() {
            return this.iconUrl;
        }

        public final CheckoutMerchant copy(String str, String str2, String str3) {
            return new CheckoutMerchant(str, str2, str3);
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass005.A0H(this.iconUrl);
        }

        public CheckoutMerchant(String str, String str2, String str3) {
            this.name = str;
            this.url = str2;
            this.iconUrl = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CheckoutPaymentSelection extends C06G {
        public static final int $stable = 0;
        public final String paymentId;
        public final String paymentMethod;
        public final String paymentType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutPaymentSelection) {
                    CheckoutPaymentSelection checkoutPaymentSelection = (CheckoutPaymentSelection) obj;
                    if (!C7384Etj.areEqual(this.paymentMethod, checkoutPaymentSelection.paymentMethod) || !C7384Etj.areEqual(this.paymentType, checkoutPaymentSelection.paymentType) || !C7384Etj.areEqual(this.paymentId, checkoutPaymentSelection.paymentId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutPaymentSelection copy$default(CheckoutPaymentSelection checkoutPaymentSelection, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkoutPaymentSelection.paymentMethod;
            }
            if ((i & 2) != 0) {
                str2 = checkoutPaymentSelection.paymentType;
            }
            if ((i & 4) != 0) {
                str3 = checkoutPaymentSelection.paymentId;
            }
            return new CheckoutPaymentSelection(str, str2, str3);
        }

        public final String component1() {
            return this.paymentMethod;
        }

        public final String component2() {
            return this.paymentType;
        }

        public final String component3() {
            return this.paymentId;
        }

        public final CheckoutPaymentSelection copy(String str, String str2, String str3) {
            return new CheckoutPaymentSelection(str, str2, str3);
        }

        public final String getPaymentId() {
            return this.paymentId;
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getPaymentType() {
            return this.paymentType;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.paymentMethod) * 31) + AnonymousClass006.A0G(this.paymentType)) * 31) + AnonymousClass005.A0H(this.paymentId);
        }

        public CheckoutPaymentSelection(String str, String str2, String str3) {
            this.paymentMethod = str;
            this.paymentType = str2;
            this.paymentId = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CheckoutScreenshot extends C06G {
        public static final int $stable = 0;
        public final String contentType;
        public final int height;
        public final long updatedAtMs;
        public final String url;
        public final int width;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutScreenshot) {
                    CheckoutScreenshot checkoutScreenshot = (CheckoutScreenshot) obj;
                    if (!C7384Etj.areEqual(this.url, checkoutScreenshot.url) || this.width != checkoutScreenshot.width || this.height != checkoutScreenshot.height || !C7384Etj.areEqual(this.contentType, checkoutScreenshot.contentType) || this.updatedAtMs != checkoutScreenshot.updatedAtMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutScreenshot copy$default(CheckoutScreenshot checkoutScreenshot, String str, int i, int i2, String str2, long j, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = checkoutScreenshot.url;
            }
            if ((i3 & 2) != 0) {
                i = checkoutScreenshot.width;
            }
            if ((i3 & 4) != 0) {
                i2 = checkoutScreenshot.height;
            }
            if ((i3 & 8) != 0) {
                str2 = checkoutScreenshot.contentType;
            }
            if ((i3 & 16) != 0) {
                j = checkoutScreenshot.updatedAtMs;
            }
            return checkoutScreenshot.copy(str, i, i2, str2, j);
        }

        public final String component1() {
            return this.url;
        }

        public final int component2() {
            return this.width;
        }

        public final int component3() {
            return this.height;
        }

        public final String component4() {
            return this.contentType;
        }

        public final long component5() {
            return this.updatedAtMs;
        }

        public final CheckoutScreenshot copy(String str, int i, int i2, String str2, long j) {
            return new CheckoutScreenshot(str, i, i2, str2, j);
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final int getHeight() {
            return this.height;
        }

        public final long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.updatedAtMs, ((((((AnonymousClass006.A0G(this.url) * 31) + this.width) * 31) + this.height) * 31) + AnonymousClass005.A0H(this.contentType)) * 31);
        }

        public CheckoutScreenshot(String str, int i, int i2, String str2, long j) {
            this.url = str;
            this.width = i;
            this.height = i2;
            this.contentType = str2;
            this.updatedAtMs = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CheckoutTab extends C06G {
        public static final int $stable = 0;
        public final String domain;
        public final String title;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutTab) {
                    CheckoutTab checkoutTab = (CheckoutTab) obj;
                    if (!C7384Etj.areEqual(this.title, checkoutTab.title) || !C7384Etj.areEqual(this.url, checkoutTab.url) || !C7384Etj.areEqual(this.domain, checkoutTab.domain)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutTab copy$default(CheckoutTab checkoutTab, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkoutTab.title;
            }
            if ((i & 2) != 0) {
                str2 = checkoutTab.url;
            }
            if ((i & 4) != 0) {
                str3 = checkoutTab.domain;
            }
            return new CheckoutTab(str, str2, str3);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.url;
        }

        public final String component3() {
            return this.domain;
        }

        public final CheckoutTab copy(String str, String str2, String str3) {
            return new CheckoutTab(str, str2, str3);
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass005.A0H(this.domain);
        }

        public CheckoutTab(String str, String str2, String str3) {
            this.title = str;
            this.url = str2;
            this.domain = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CheckoutTotal extends C06G {
        public static final int $stable = 0;
        public final String amount;
        public final String currency;
        public final String displayText;
        public final String type;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutTotal) {
                    CheckoutTotal checkoutTotal = (CheckoutTotal) obj;
                    if (!C7384Etj.areEqual(this.type, checkoutTotal.type) || !C7384Etj.areEqual(this.displayText, checkoutTotal.displayText) || !C7384Etj.areEqual(this.amount, checkoutTotal.amount) || !C7384Etj.areEqual(this.currency, checkoutTotal.currency)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutTotal copy$default(CheckoutTotal checkoutTotal, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkoutTotal.type;
            }
            if ((i & 2) != 0) {
                str2 = checkoutTotal.displayText;
            }
            if ((i & 4) != 0) {
                str3 = checkoutTotal.amount;
            }
            if ((i & 8) != 0) {
                str4 = checkoutTotal.currency;
            }
            return new CheckoutTotal(str, str2, str3, str4);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.displayText;
        }

        public final String component3() {
            return this.amount;
        }

        public final String component4() {
            return this.currency;
        }

        public final CheckoutTotal copy(String str, String str2, String str3, String str4) {
            return new CheckoutTotal(str, str2, str3, str4);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDisplayText() {
            return this.displayText;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0G(this.displayText)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass005.A0H(this.currency);
        }

        public CheckoutTotal(String str, String str2, String str3, String str4) {
            this.type = str;
            this.displayText = str2;
            this.amount = str3;
            this.currency = str4;
        }

        public String toString() {
            return super.toString();
        }
    }

    public interface DecideResult {

        public final class Confirming extends C06G implements DecideResult {
            public static final int $stable = 8;
            public final Set<String> approvalIds;

            public Confirming(Set<String> set) {
                C7384Etj.A0Y(set, 0);
                this.approvalIds = set;
            }

            public final Confirming copy(Set<String> set) {
                C7384Etj.A0Y(set, 0);
                return new Confirming(set);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Confirming) && C7384Etj.areEqual(this.approvalIds, ((Confirming) obj).approvalIds));
            }

            public static /* synthetic */ Confirming copy$default(Confirming confirming, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = confirming.approvalIds;
                }
                C7384Etj.A0Y(set, 0);
                return new Confirming(set);
            }

            public final Set<String> component1() {
                return this.approvalIds;
            }

            public final Set<String> getApprovalIds() {
                return this.approvalIds;
            }

            public int hashCode() {
                return this.approvalIds.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Failed extends C06G implements DecideResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class PartiallyApplied extends C06G implements DecideResult {
            public static final int $stable = 8;
            public final Set<String> unappliedApprovalIds;

            public PartiallyApplied(Set<String> set) {
                C7384Etj.A0Y(set, 0);
                this.unappliedApprovalIds = set;
            }

            public final PartiallyApplied copy(Set<String> set) {
                C7384Etj.A0Y(set, 0);
                return new PartiallyApplied(set);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof PartiallyApplied) && C7384Etj.areEqual(this.unappliedApprovalIds, ((PartiallyApplied) obj).unappliedApprovalIds));
            }

            public static /* synthetic */ PartiallyApplied copy$default(PartiallyApplied partiallyApplied, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = partiallyApplied.unappliedApprovalIds;
                }
                C7384Etj.A0Y(set, 0);
                return new PartiallyApplied(set);
            }

            public final Set<String> component1() {
                return this.unappliedApprovalIds;
            }

            public final Set<String> getUnappliedApprovalIds() {
                return this.unappliedApprovalIds;
            }

            public int hashCode() {
                return this.unappliedApprovalIds.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success implements DecideResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();
        }
    }

    public final class DeviceApprovalCopy extends C06G {
        public static final int $stable = 0;
        public final String purposeSummary;
        public final String requestPreview;
        public final String scopeSummary;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DeviceApprovalCopy) {
                    DeviceApprovalCopy deviceApprovalCopy = (DeviceApprovalCopy) obj;
                    if (!C7384Etj.areEqual(this.purposeSummary, deviceApprovalCopy.purposeSummary) || !C7384Etj.areEqual(this.scopeSummary, deviceApprovalCopy.scopeSummary) || !C7384Etj.areEqual(this.requestPreview, deviceApprovalCopy.requestPreview)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DeviceApprovalCopy copy$default(DeviceApprovalCopy deviceApprovalCopy, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceApprovalCopy.purposeSummary;
            }
            if ((i & 2) != 0) {
                str2 = deviceApprovalCopy.scopeSummary;
            }
            if ((i & 4) != 0) {
                str3 = deviceApprovalCopy.requestPreview;
            }
            return new DeviceApprovalCopy(str, str2, str3);
        }

        public final String component1() {
            return this.purposeSummary;
        }

        public final String component2() {
            return this.scopeSummary;
        }

        public final String component3() {
            return this.requestPreview;
        }

        public final DeviceApprovalCopy copy(String str, String str2, String str3) {
            return new DeviceApprovalCopy(str, str2, str3);
        }

        public final String getPurposeSummary() {
            return this.purposeSummary;
        }

        public final String getRequestPreview() {
            return this.requestPreview;
        }

        public final String getScopeSummary() {
            return this.scopeSummary;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.purposeSummary) * 31) + AnonymousClass006.A0G(this.scopeSummary)) * 31) + AnonymousClass005.A0H(this.requestPreview);
        }

        public DeviceApprovalCopy(String str, String str2, String str3) {
            this.purposeSummary = str;
            this.scopeSummary = str2;
            this.requestPreview = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FlightCheckoutApproval extends C06G implements CheckoutApprovalPayload {
        public static final int $stable = 0;
        public final String amount;
        public final String cardBrand;
        public final String cardLast4;
        public final String carrierDetail;
        public final String carrierLabel;
        public final String currency;
        public final List<CheckoutLegalLink> legalLinks;
        public final CheckoutMerchant merchant;
        public final F0C merchantDisplayName$delegate;
        public final F0C passengerNames$delegate;
        public final List<FlightCheckoutPassenger> passengers;
        public final String paymentMethodLabel;
        public final List<WalletPaymentOption> paymentOptions;
        public final CheckoutPaymentSelection paymentSelection;
        public final List<FlightCheckoutSlice> slices;
        public final List<CheckoutTotal> totals;
        public final String tripTypeLabel;
        public final int version;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutApproval) {
                    FlightCheckoutApproval flightCheckoutApproval = (FlightCheckoutApproval) obj;
                    if (this.version != flightCheckoutApproval.version || !C7384Etj.areEqual(this.merchant, flightCheckoutApproval.merchant) || !C7384Etj.areEqual(this.tripTypeLabel, flightCheckoutApproval.tripTypeLabel) || !C7384Etj.areEqual(this.carrierLabel, flightCheckoutApproval.carrierLabel) || !C7384Etj.areEqual(this.carrierDetail, flightCheckoutApproval.carrierDetail) || !C7384Etj.areEqual(this.slices, flightCheckoutApproval.slices) || !C7384Etj.areEqual(this.passengers, flightCheckoutApproval.passengers) || !C7384Etj.areEqual(this.amount, flightCheckoutApproval.amount) || !C7384Etj.areEqual(this.currency, flightCheckoutApproval.currency) || !C7384Etj.areEqual(this.totals, flightCheckoutApproval.totals) || !C7384Etj.areEqual(this.legalLinks, flightCheckoutApproval.legalLinks) || !C7384Etj.areEqual(this.paymentMethodLabel, flightCheckoutApproval.paymentMethodLabel) || !C7384Etj.areEqual(this.cardBrand, flightCheckoutApproval.cardBrand) || !C7384Etj.areEqual(this.cardLast4, flightCheckoutApproval.cardLast4) || !C7384Etj.areEqual(this.paymentSelection, flightCheckoutApproval.paymentSelection) || !C7384Etj.areEqual(this.paymentOptions, flightCheckoutApproval.paymentOptions)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ FlightCheckoutApproval(int i, CheckoutMerchant checkoutMerchant, String str, String str2, String str3, List list, List list2, String str4, String str5, List list3, List list4, String str6, String str7, String str8, CheckoutPaymentSelection checkoutPaymentSelection, List list5, int i2, C06H c06h) {
            this(i, checkoutMerchant, str, str2, str3, list, list2, str4, str5, list3, list4, str6, str7, str8, (i2 & 16384) != 0 ? null : checkoutPaymentSelection, (i2 & 32768) != 0 ? C0881AGi.A00 : list5);
        }

        public static /* synthetic */ FlightCheckoutApproval copy$default(FlightCheckoutApproval flightCheckoutApproval, int i, CheckoutMerchant checkoutMerchant, String str, String str2, String str3, List list, List list2, String str4, String str5, List list3, List list4, String str6, String str7, String str8, CheckoutPaymentSelection checkoutPaymentSelection, List list5, int i2, Object obj) {
            int i3 = i;
            CheckoutMerchant checkoutMerchant2 = checkoutMerchant;
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            List list6 = list;
            List list7 = list2;
            String str12 = str4;
            String str13 = str5;
            List list8 = list3;
            List list9 = list4;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            CheckoutPaymentSelection checkoutPaymentSelection2 = checkoutPaymentSelection;
            List list10 = list5;
            if ((i2 & 1) != 0) {
                i3 = flightCheckoutApproval.version;
            }
            if ((i2 & 2) != 0) {
                checkoutMerchant2 = flightCheckoutApproval.merchant;
            }
            if ((i2 & 4) != 0) {
                str9 = flightCheckoutApproval.tripTypeLabel;
            }
            if ((i2 & 8) != 0) {
                str10 = flightCheckoutApproval.carrierLabel;
            }
            if ((i2 & 16) != 0) {
                str11 = flightCheckoutApproval.carrierDetail;
            }
            if ((i2 & 32) != 0) {
                list6 = flightCheckoutApproval.slices;
            }
            if ((i2 & 64) != 0) {
                list7 = flightCheckoutApproval.passengers;
            }
            if ((i2 & 128) != 0) {
                str12 = flightCheckoutApproval.amount;
            }
            if ((i2 & 256) != 0) {
                str13 = flightCheckoutApproval.currency;
            }
            if ((i2 & 512) != 0) {
                list8 = flightCheckoutApproval.totals;
            }
            if ((i2 & 1024) != 0) {
                list9 = flightCheckoutApproval.legalLinks;
            }
            if ((i2 & 2048) != 0) {
                str14 = flightCheckoutApproval.paymentMethodLabel;
            }
            if ((i2 & 4096) != 0) {
                str15 = flightCheckoutApproval.cardBrand;
            }
            if ((i2 & 8192) != 0) {
                str16 = flightCheckoutApproval.cardLast4;
            }
            if ((i2 & 16384) != 0) {
                checkoutPaymentSelection2 = flightCheckoutApproval.paymentSelection;
            }
            if ((i2 & 32768) != 0) {
                list10 = flightCheckoutApproval.paymentOptions;
            }
            String str17 = str10;
            return flightCheckoutApproval.copy(i3, checkoutMerchant2, str9, str17, str11, list6, list7, str12, str13, list8, list9, str14, str15, str16, checkoutPaymentSelection2, list10);
        }

        public final int component1() {
            return this.version;
        }

        public final List<CheckoutTotal> component10() {
            return this.totals;
        }

        public final List<CheckoutLegalLink> component11() {
            return this.legalLinks;
        }

        public final String component12() {
            return this.paymentMethodLabel;
        }

        public final String component13() {
            return this.cardBrand;
        }

        public final String component14() {
            return this.cardLast4;
        }

        public final CheckoutPaymentSelection component15() {
            return this.paymentSelection;
        }

        public final List<WalletPaymentOption> component16() {
            return this.paymentOptions;
        }

        public final CheckoutMerchant component2() {
            return this.merchant;
        }

        public final String component3() {
            return this.tripTypeLabel;
        }

        public final String component4() {
            return this.carrierLabel;
        }

        public final String component5() {
            return this.carrierDetail;
        }

        public final List<FlightCheckoutSlice> component6() {
            return this.slices;
        }

        public final List<FlightCheckoutPassenger> component7() {
            return this.passengers;
        }

        public final String component8() {
            return this.amount;
        }

        public final String component9() {
            return this.currency;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCardBrand() {
            return this.cardBrand;
        }

        public final String getCardLast4() {
            return this.cardLast4;
        }

        public final String getCarrierDetail() {
            return this.carrierDetail;
        }

        public final String getCarrierLabel() {
            return this.carrierLabel;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final List<CheckoutLegalLink> getLegalLinks() {
            return this.legalLinks;
        }

        public final CheckoutMerchant getMerchant() {
            return this.merchant;
        }

        public final String getMerchantDisplayName() {
            return (String) this.merchantDisplayName$delegate.getValue();
        }

        public final String getPassengerNames() {
            return (String) this.passengerNames$delegate.getValue();
        }

        public final List<FlightCheckoutPassenger> getPassengers() {
            return this.passengers;
        }

        public final String getPaymentMethodLabel() {
            return this.paymentMethodLabel;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public List<WalletPaymentOption> getPaymentOptions() {
            return this.paymentOptions;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public CheckoutPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final List<FlightCheckoutSlice> getSlices() {
            return this.slices;
        }

        public final List<CheckoutTotal> getTotals() {
            return this.totals;
        }

        public final String getTripTypeLabel() {
            return this.tripTypeLabel;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.paymentOptions, (((((((AnonymousClass005.A0F(this.legalLinks, AnonymousClass005.A0F(this.totals, (((AnonymousClass005.A0F(this.passengers, AnonymousClass005.A0F(this.slices, ((((((((this.version * 31) + AnonymousClass006.A0D(this.merchant)) * 31) + AnonymousClass006.A0G(this.tripTypeLabel)) * 31) + AnonymousClass006.A0G(this.carrierLabel)) * 31) + AnonymousClass006.A0G(this.carrierDetail)) * 31)) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31)) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31) + C3cH.A02(this.paymentSelection)) * 31);
        }

        public final FlightCheckoutApproval copy(int i, CheckoutMerchant checkoutMerchant, String str, String str2, String str3, List<FlightCheckoutSlice> list, List<FlightCheckoutPassenger> list2, String str4, String str5, List<CheckoutTotal> list3, List<CheckoutLegalLink> list4, String str6, String str7, String str8, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list5) {
            AnonymousClass003.A0z(list, list2);
            C3cH.A18(list3, list4);
            C7384Etj.A0Y(list5, 15);
            return new FlightCheckoutApproval(i, checkoutMerchant, str, str2, str3, list, list2, str4, str5, list3, list4, str6, str7, str8, checkoutPaymentSelection, list5);
        }

        public String toString() {
            return super.toString();
        }

        public FlightCheckoutApproval(int i, CheckoutMerchant checkoutMerchant, String str, String str2, String str3, List<FlightCheckoutSlice> list, List<FlightCheckoutPassenger> list2, String str4, String str5, List<CheckoutTotal> list3, List<CheckoutLegalLink> list4, String str6, String str7, String str8, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list5) {
            AnonymousClass003.A0z(list, list2);
            C3cH.A18(list3, list4);
            C7384Etj.A0Y(list5, 15);
            this.version = i;
            this.merchant = checkoutMerchant;
            this.tripTypeLabel = str;
            this.carrierLabel = str2;
            this.carrierDetail = str3;
            this.slices = list;
            this.passengers = list2;
            this.amount = str4;
            this.currency = str5;
            this.totals = list3;
            this.legalLinks = list4;
            this.paymentMethodLabel = str6;
            this.cardBrand = str7;
            this.cardLast4 = str8;
            this.paymentSelection = checkoutPaymentSelection;
            this.paymentOptions = list5;
            this.merchantDisplayName$delegate = AbstractC5321DgF.A03(new HatchAgentPermissionsRepository$FlightCheckoutApproval$merchantDisplayName$2(this));
            this.passengerNames$delegate = AbstractC5321DgF.A03(new HatchAgentPermissionsRepository$FlightCheckoutApproval$passengerNames$2(this));
        }
    }

    public final class FlightCheckoutBaggage extends C06G {
        public static final int $stable = 0;
        public final Integer passengerIndex;
        public final String passengerName;
        public final int quantity;
        public final String type;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutBaggage) {
                    FlightCheckoutBaggage flightCheckoutBaggage = (FlightCheckoutBaggage) obj;
                    if (!C7384Etj.areEqual(this.passengerName, flightCheckoutBaggage.passengerName) || !C7384Etj.areEqual(this.passengerIndex, flightCheckoutBaggage.passengerIndex) || !C7384Etj.areEqual(this.type, flightCheckoutBaggage.type) || this.quantity != flightCheckoutBaggage.quantity) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FlightCheckoutBaggage copy$default(FlightCheckoutBaggage flightCheckoutBaggage, String str, Integer num, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = flightCheckoutBaggage.passengerName;
            }
            if ((i2 & 2) != 0) {
                num = flightCheckoutBaggage.passengerIndex;
            }
            if ((i2 & 4) != 0) {
                str2 = flightCheckoutBaggage.type;
            }
            if ((i2 & 8) != 0) {
                i = flightCheckoutBaggage.quantity;
            }
            AnonymousClass003.A0v(str, str2);
            return new FlightCheckoutBaggage(str, num, str2, i);
        }

        public final String component1() {
            return this.passengerName;
        }

        public final Integer component2() {
            return this.passengerIndex;
        }

        public final String component3() {
            return this.type;
        }

        public final int component4() {
            return this.quantity;
        }

        public final Integer getPassengerIndex() {
            return this.passengerIndex;
        }

        public final String getPassengerName() {
            return this.passengerName;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.type, (AnonymousClass001.A0G(this.passengerName) + AnonymousClass006.A0D(this.passengerIndex)) * 31) + this.quantity;
        }

        public FlightCheckoutBaggage(String str, Integer num, String str2, int i) {
            AnonymousClass003.A0v(str, str2);
            this.passengerName = str;
            this.passengerIndex = num;
            this.type = str2;
            this.quantity = i;
        }

        public final FlightCheckoutBaggage copy(String str, Integer num, String str2, int i) {
            AnonymousClass003.A0v(str, str2);
            return new FlightCheckoutBaggage(str, num, str2, i);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FlightCheckoutDetailRow extends C06G {
        public static final int $stable = 0;
        public final FlightCheckoutDetailRowKind kind;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutDetailRow) {
                    FlightCheckoutDetailRow flightCheckoutDetailRow = (FlightCheckoutDetailRow) obj;
                    if (this.kind != flightCheckoutDetailRow.kind || !C7384Etj.areEqual(this.text, flightCheckoutDetailRow.text)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FlightCheckoutDetailRow copy$default(FlightCheckoutDetailRow flightCheckoutDetailRow, FlightCheckoutDetailRowKind flightCheckoutDetailRowKind, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                flightCheckoutDetailRowKind = flightCheckoutDetailRow.kind;
            }
            if ((i & 2) != 0) {
                str = flightCheckoutDetailRow.text;
            }
            AnonymousClass003.A0u(flightCheckoutDetailRowKind, str);
            return new FlightCheckoutDetailRow(flightCheckoutDetailRowKind, str);
        }

        public final FlightCheckoutDetailRowKind component1() {
            return this.kind;
        }

        public final String component2() {
            return this.text;
        }

        public final FlightCheckoutDetailRowKind getKind() {
            return this.kind;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.text, AnonymousClass005.A0E(this.kind));
        }

        public FlightCheckoutDetailRow(FlightCheckoutDetailRowKind flightCheckoutDetailRowKind, String str) {
            AnonymousClass003.A0u(flightCheckoutDetailRowKind, str);
            this.kind = flightCheckoutDetailRowKind;
            this.text = str;
        }

        public final FlightCheckoutDetailRow copy(FlightCheckoutDetailRowKind flightCheckoutDetailRowKind, String str) {
            AnonymousClass003.A0u(flightCheckoutDetailRowKind, str);
            return new FlightCheckoutDetailRow(flightCheckoutDetailRowKind, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FlightCheckoutPassenger extends C06G {
        public static final int $stable = 8;
        public final String bornOnDisplay;
        public final String displayName;
        public final String email;
        public final String genderDisplay;
        public final String knownTravelerNumberDisplay;
        public final List<String> loyaltyAccounts;
        public final String phoneNumber;
        public final String redressNumberDisplay;
        public final String type;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutPassenger) {
                    FlightCheckoutPassenger flightCheckoutPassenger = (FlightCheckoutPassenger) obj;
                    if (!C7384Etj.areEqual(this.displayName, flightCheckoutPassenger.displayName) || !C7384Etj.areEqual(this.type, flightCheckoutPassenger.type) || !C7384Etj.areEqual(this.email, flightCheckoutPassenger.email) || !C7384Etj.areEqual(this.phoneNumber, flightCheckoutPassenger.phoneNumber) || !C7384Etj.areEqual(this.bornOnDisplay, flightCheckoutPassenger.bornOnDisplay) || !C7384Etj.areEqual(this.genderDisplay, flightCheckoutPassenger.genderDisplay) || !C7384Etj.areEqual(this.knownTravelerNumberDisplay, flightCheckoutPassenger.knownTravelerNumberDisplay) || !C7384Etj.areEqual(this.redressNumberDisplay, flightCheckoutPassenger.redressNumberDisplay) || !C7384Etj.areEqual(this.loyaltyAccounts, flightCheckoutPassenger.loyaltyAccounts)) {
                    }
                }
                return false;
            }
            return true;
        }

        public FlightCheckoutPassenger(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
            C7384Etj.A0Y(list, 8);
            this.displayName = str;
            this.type = str2;
            this.email = str3;
            this.phoneNumber = str4;
            this.bornOnDisplay = str5;
            this.genderDisplay = str6;
            this.knownTravelerNumberDisplay = str7;
            this.redressNumberDisplay = str8;
            this.loyaltyAccounts = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlightCheckoutPassenger copy$default(FlightCheckoutPassenger flightCheckoutPassenger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = flightCheckoutPassenger.displayName;
            }
            if ((i & 2) != 0) {
                str2 = flightCheckoutPassenger.type;
            }
            if ((i & 4) != 0) {
                str3 = flightCheckoutPassenger.email;
            }
            if ((i & 8) != 0) {
                str4 = flightCheckoutPassenger.phoneNumber;
            }
            if ((i & 16) != 0) {
                str5 = flightCheckoutPassenger.bornOnDisplay;
            }
            if ((i & 32) != 0) {
                str6 = flightCheckoutPassenger.genderDisplay;
            }
            if ((i & 64) != 0) {
                str7 = flightCheckoutPassenger.knownTravelerNumberDisplay;
            }
            if ((i & 128) != 0) {
                str8 = flightCheckoutPassenger.redressNumberDisplay;
            }
            if ((i & 256) != 0) {
                list = flightCheckoutPassenger.loyaltyAccounts;
            }
            return flightCheckoutPassenger.copy(str, str2, str3, str4, str5, str6, str7, str8, list);
        }

        public final String component1() {
            return this.displayName;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.email;
        }

        public final String component4() {
            return this.phoneNumber;
        }

        public final String component5() {
            return this.bornOnDisplay;
        }

        public final String component6() {
            return this.genderDisplay;
        }

        public final String component7() {
            return this.knownTravelerNumberDisplay;
        }

        public final String component8() {
            return this.redressNumberDisplay;
        }

        public final List<String> component9() {
            return this.loyaltyAccounts;
        }

        public final FlightCheckoutPassenger copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
            C7384Etj.A0Y(list, 8);
            return new FlightCheckoutPassenger(str, str2, str3, str4, str5, str6, str7, str8, list);
        }

        public final String getBornOnDisplay() {
            return this.bornOnDisplay;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getGenderDisplay() {
            return this.genderDisplay;
        }

        public final String getKnownTravelerNumberDisplay() {
            return this.knownTravelerNumberDisplay;
        }

        public final List<String> getLoyaltyAccounts() {
            return this.loyaltyAccounts;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getRedressNumberDisplay() {
            return this.redressNumberDisplay;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.loyaltyAccounts, ((((((((((((((AnonymousClass006.A0G(this.displayName) * 31) + AnonymousClass006.A0G(this.type)) * 31) + AnonymousClass006.A0G(this.email)) * 31) + AnonymousClass006.A0G(this.phoneNumber)) * 31) + AnonymousClass006.A0G(this.bornOnDisplay)) * 31) + AnonymousClass006.A0G(this.genderDisplay)) * 31) + AnonymousClass006.A0G(this.knownTravelerNumberDisplay)) * 31) + AnonymousClass005.A0H(this.redressNumberDisplay)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FlightCheckoutSeatAssignment extends C06G {
        public static final int $stable = 0;
        public final String cabinLabel;
        public final String designator;
        public final Integer passengerIndex;
        public final String passengerName;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutSeatAssignment) {
                    FlightCheckoutSeatAssignment flightCheckoutSeatAssignment = (FlightCheckoutSeatAssignment) obj;
                    if (!C7384Etj.areEqual(this.passengerName, flightCheckoutSeatAssignment.passengerName) || !C7384Etj.areEqual(this.passengerIndex, flightCheckoutSeatAssignment.passengerIndex) || !C7384Etj.areEqual(this.designator, flightCheckoutSeatAssignment.designator) || !C7384Etj.areEqual(this.cabinLabel, flightCheckoutSeatAssignment.cabinLabel)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FlightCheckoutSeatAssignment copy$default(FlightCheckoutSeatAssignment flightCheckoutSeatAssignment, String str, Integer num, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = flightCheckoutSeatAssignment.passengerName;
            }
            if ((i & 2) != 0) {
                num = flightCheckoutSeatAssignment.passengerIndex;
            }
            if ((i & 4) != 0) {
                str2 = flightCheckoutSeatAssignment.designator;
            }
            if ((i & 8) != 0) {
                str3 = flightCheckoutSeatAssignment.cabinLabel;
            }
            AnonymousClass003.A0v(str, str2);
            return new FlightCheckoutSeatAssignment(str, num, str2, str3);
        }

        public final String component1() {
            return this.passengerName;
        }

        public final Integer component2() {
            return this.passengerIndex;
        }

        public final String component3() {
            return this.designator;
        }

        public final String component4() {
            return this.cabinLabel;
        }

        public final String getCabinLabel() {
            return this.cabinLabel;
        }

        public final String getDesignator() {
            return this.designator;
        }

        public final Integer getPassengerIndex() {
            return this.passengerIndex;
        }

        public final String getPassengerName() {
            return this.passengerName;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.designator, (AnonymousClass001.A0G(this.passengerName) + AnonymousClass006.A0D(this.passengerIndex)) * 31) + AnonymousClass005.A0H(this.cabinLabel);
        }

        public FlightCheckoutSeatAssignment(String str, Integer num, String str2, String str3) {
            AnonymousClass003.A0v(str, str2);
            this.passengerName = str;
            this.passengerIndex = num;
            this.designator = str2;
            this.cabinLabel = str3;
        }

        public final FlightCheckoutSeatAssignment copy(String str, Integer num, String str2, String str3) {
            AnonymousClass003.A0v(str, str2);
            return new FlightCheckoutSeatAssignment(str, num, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FlightCheckoutSegment extends C06G {
        public static final int $stable = 8;
        public final String airlineIconUrl;
        public final String arrivingDisplay;
        public final List<FlightCheckoutBaggage> baggage;
        public final String carrierName;
        public final LocalDate departingDate;
        public final String departingDisplay;
        public final List<FlightCheckoutDetailRow> detailRows;
        public final String flightDisplay;
        public final String flightNumber;
        public final List<FlightCheckoutSeatAssignment> seatAssignments;
        public final String seatsDisplay;
        public final String title;

        public FlightCheckoutSegment(String str, String str2, String str3, String str4, String str5, List<FlightCheckoutDetailRow> list, String str6, List<FlightCheckoutSeatAssignment> list2, List<FlightCheckoutBaggage> list3, String str7, String str8, LocalDate localDate) {
            AnonymousClass005.A13(list, list2, list3, 5);
            this.title = str;
            this.departingDisplay = str2;
            this.arrivingDisplay = str3;
            this.seatsDisplay = str4;
            this.flightDisplay = str5;
            this.detailRows = list;
            this.airlineIconUrl = str6;
            this.seatAssignments = list2;
            this.baggage = list3;
            this.carrierName = str7;
            this.flightNumber = str8;
            this.departingDate = localDate;
        }

        public final FlightCheckoutSegment copy(String str, String str2, String str3, String str4, String str5, List<FlightCheckoutDetailRow> list, String str6, List<FlightCheckoutSeatAssignment> list2, List<FlightCheckoutBaggage> list3, String str7, String str8, LocalDate localDate) {
            AnonymousClass005.A13(list, list2, list3, 5);
            return new FlightCheckoutSegment(str, str2, str3, str4, str5, list, str6, list2, list3, str7, str8, localDate);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutSegment) {
                    FlightCheckoutSegment flightCheckoutSegment = (FlightCheckoutSegment) obj;
                    if (!C7384Etj.areEqual(this.title, flightCheckoutSegment.title) || !C7384Etj.areEqual(this.departingDisplay, flightCheckoutSegment.departingDisplay) || !C7384Etj.areEqual(this.arrivingDisplay, flightCheckoutSegment.arrivingDisplay) || !C7384Etj.areEqual(this.seatsDisplay, flightCheckoutSegment.seatsDisplay) || !C7384Etj.areEqual(this.flightDisplay, flightCheckoutSegment.flightDisplay) || !C7384Etj.areEqual(this.detailRows, flightCheckoutSegment.detailRows) || !C7384Etj.areEqual(this.airlineIconUrl, flightCheckoutSegment.airlineIconUrl) || !C7384Etj.areEqual(this.seatAssignments, flightCheckoutSegment.seatAssignments) || !C7384Etj.areEqual(this.baggage, flightCheckoutSegment.baggage) || !C7384Etj.areEqual(this.carrierName, flightCheckoutSegment.carrierName) || !C7384Etj.areEqual(this.flightNumber, flightCheckoutSegment.flightNumber) || !C7384Etj.areEqual(this.departingDate, flightCheckoutSegment.departingDate)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlightCheckoutSegment copy$default(FlightCheckoutSegment flightCheckoutSegment, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, String str8, LocalDate localDate, int i, Object obj) {
            if ((i & 1) != 0) {
                str = flightCheckoutSegment.title;
            }
            if ((i & 2) != 0) {
                str2 = flightCheckoutSegment.departingDisplay;
            }
            if ((i & 4) != 0) {
                str3 = flightCheckoutSegment.arrivingDisplay;
            }
            if ((i & 8) != 0) {
                str4 = flightCheckoutSegment.seatsDisplay;
            }
            if ((i & 16) != 0) {
                str5 = flightCheckoutSegment.flightDisplay;
            }
            if ((i & 32) != 0) {
                list = flightCheckoutSegment.detailRows;
            }
            if ((i & 64) != 0) {
                str6 = flightCheckoutSegment.airlineIconUrl;
            }
            if ((i & 128) != 0) {
                list2 = flightCheckoutSegment.seatAssignments;
            }
            if ((i & 256) != 0) {
                list3 = flightCheckoutSegment.baggage;
            }
            if ((i & 512) != 0) {
                str7 = flightCheckoutSegment.carrierName;
            }
            if ((i & 1024) != 0) {
                str8 = flightCheckoutSegment.flightNumber;
            }
            if ((i & 2048) != 0) {
                localDate = flightCheckoutSegment.departingDate;
            }
            return flightCheckoutSegment.copy(str, str2, str3, str4, str5, list, str6, list2, list3, str7, str8, localDate);
        }

        public final String component1() {
            return this.title;
        }

        public final String component10() {
            return this.carrierName;
        }

        public final String component11() {
            return this.flightNumber;
        }

        public final LocalDate component12() {
            return this.departingDate;
        }

        public final String component2() {
            return this.departingDisplay;
        }

        public final String component3() {
            return this.arrivingDisplay;
        }

        public final String component4() {
            return this.seatsDisplay;
        }

        public final String component5() {
            return this.flightDisplay;
        }

        public final List<FlightCheckoutDetailRow> component6() {
            return this.detailRows;
        }

        public final String component7() {
            return this.airlineIconUrl;
        }

        public final List<FlightCheckoutSeatAssignment> component8() {
            return this.seatAssignments;
        }

        public final List<FlightCheckoutBaggage> component9() {
            return this.baggage;
        }

        public final String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        public final String getArrivingDisplay() {
            return this.arrivingDisplay;
        }

        public final List<FlightCheckoutBaggage> getBaggage() {
            return this.baggage;
        }

        public final String getCarrierName() {
            return this.carrierName;
        }

        public final LocalDate getDepartingDate() {
            return this.departingDate;
        }

        public final String getDepartingDisplay() {
            return this.departingDisplay;
        }

        public final List<FlightCheckoutDetailRow> getDetailRows() {
            return this.detailRows;
        }

        public final String getFlightDisplay() {
            return this.flightDisplay;
        }

        public final String getFlightNumber() {
            return this.flightNumber;
        }

        public final List<FlightCheckoutSeatAssignment> getSeatAssignments() {
            return this.seatAssignments;
        }

        public final String getSeatsDisplay() {
            return this.seatsDisplay;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0F(this.baggage, AnonymousClass005.A0F(this.seatAssignments, (AnonymousClass005.A0F(this.detailRows, ((((((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.departingDisplay)) * 31) + AnonymousClass006.A0G(this.arrivingDisplay)) * 31) + AnonymousClass006.A0G(this.seatsDisplay)) * 31) + AnonymousClass006.A0G(this.flightDisplay)) * 31) + AnonymousClass006.A0G(this.airlineIconUrl)) * 31)) + AnonymousClass006.A0G(this.carrierName)) * 31) + AnonymousClass006.A0G(this.flightNumber)) * 31) + C3cH.A02(this.departingDate);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FlightCheckoutSegment(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, String str8, LocalDate localDate, int i, C06H c06h) {
            this(str, str2, str3, str4, str5, list, (i & 64) != 0 ? null : str6, list2, list3, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : localDate);
        }
    }

    public final class FlightCheckoutSlice extends C06G {
        public static final int $stable = 8;
        public final String departureDisplay;
        public final String destinationDisplayName;
        public final String originDisplayName;
        public final List<FlightCheckoutSegment> segments;
        public final String stopsDisplay;
        public final String subtitle;
        public final String title;

        public FlightCheckoutSlice(String str, String str2, String str3, String str4, String str5, String str6, List<FlightCheckoutSegment> list) {
            C7384Etj.A0Y(list, 6);
            this.originDisplayName = str;
            this.destinationDisplayName = str2;
            this.departureDisplay = str3;
            this.stopsDisplay = str4;
            this.title = str5;
            this.subtitle = str6;
            this.segments = list;
        }

        public final FlightCheckoutSlice copy(String str, String str2, String str3, String str4, String str5, String str6, List<FlightCheckoutSegment> list) {
            C7384Etj.A0Y(list, 6);
            return new FlightCheckoutSlice(str, str2, str3, str4, str5, str6, list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FlightCheckoutSlice) {
                    FlightCheckoutSlice flightCheckoutSlice = (FlightCheckoutSlice) obj;
                    if (!C7384Etj.areEqual(this.originDisplayName, flightCheckoutSlice.originDisplayName) || !C7384Etj.areEqual(this.destinationDisplayName, flightCheckoutSlice.destinationDisplayName) || !C7384Etj.areEqual(this.departureDisplay, flightCheckoutSlice.departureDisplay) || !C7384Etj.areEqual(this.stopsDisplay, flightCheckoutSlice.stopsDisplay) || !C7384Etj.areEqual(this.title, flightCheckoutSlice.title) || !C7384Etj.areEqual(this.subtitle, flightCheckoutSlice.subtitle) || !C7384Etj.areEqual(this.segments, flightCheckoutSlice.segments)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlightCheckoutSlice copy$default(FlightCheckoutSlice flightCheckoutSlice, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = flightCheckoutSlice.originDisplayName;
            }
            if ((i & 2) != 0) {
                str2 = flightCheckoutSlice.destinationDisplayName;
            }
            if ((i & 4) != 0) {
                str3 = flightCheckoutSlice.departureDisplay;
            }
            if ((i & 8) != 0) {
                str4 = flightCheckoutSlice.stopsDisplay;
            }
            if ((i & 16) != 0) {
                str5 = flightCheckoutSlice.title;
            }
            if ((i & 32) != 0) {
                str6 = flightCheckoutSlice.subtitle;
            }
            if ((i & 64) != 0) {
                list = flightCheckoutSlice.segments;
            }
            return flightCheckoutSlice.copy(str, str2, str3, str4, str5, str6, list);
        }

        public final String component1() {
            return this.originDisplayName;
        }

        public final String component2() {
            return this.destinationDisplayName;
        }

        public final String component3() {
            return this.departureDisplay;
        }

        public final String component4() {
            return this.stopsDisplay;
        }

        public final String component5() {
            return this.title;
        }

        public final String component6() {
            return this.subtitle;
        }

        public final List<FlightCheckoutSegment> component7() {
            return this.segments;
        }

        public final String getDepartureDisplay() {
            return this.departureDisplay;
        }

        public final String getDestinationDisplayName() {
            return this.destinationDisplayName;
        }

        public final String getOriginDisplayName() {
            return this.originDisplayName;
        }

        public final List<FlightCheckoutSegment> getSegments() {
            return this.segments;
        }

        public final String getStopsDisplay() {
            return this.stopsDisplay;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.segments, ((((((((((AnonymousClass006.A0G(this.originDisplayName) * 31) + AnonymousClass006.A0G(this.destinationDisplayName)) * 31) + AnonymousClass006.A0G(this.departureDisplay)) * 31) + AnonymousClass006.A0G(this.stopsDisplay)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass005.A0H(this.subtitle)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OutgoingMediaApproval extends C06G implements AgentPermissionRichPayload {
        public static final int $stable = 8;
        public final List<OutgoingMediaItem> items;
        public final String messageText;
        public final String recipientDisplay;
        public final int version;

        public OutgoingMediaApproval(int i, String str, String str2, List<OutgoingMediaItem> list) {
            C7384Etj.A0Y(list, 3);
            this.version = i;
            this.recipientDisplay = str;
            this.messageText = str2;
            this.items = list;
        }

        public final OutgoingMediaApproval copy(int i, String str, String str2, List<OutgoingMediaItem> list) {
            C7384Etj.A0Y(list, 3);
            return new OutgoingMediaApproval(i, str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OutgoingMediaApproval) {
                    OutgoingMediaApproval outgoingMediaApproval = (OutgoingMediaApproval) obj;
                    if (this.version != outgoingMediaApproval.version || !C7384Etj.areEqual(this.recipientDisplay, outgoingMediaApproval.recipientDisplay) || !C7384Etj.areEqual(this.messageText, outgoingMediaApproval.messageText) || !C7384Etj.areEqual(this.items, outgoingMediaApproval.items)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OutgoingMediaApproval copy$default(OutgoingMediaApproval outgoingMediaApproval, int i, String str, String str2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = outgoingMediaApproval.version;
            }
            if ((i2 & 2) != 0) {
                str = outgoingMediaApproval.recipientDisplay;
            }
            if ((i2 & 4) != 0) {
                str2 = outgoingMediaApproval.messageText;
            }
            if ((i2 & 8) != 0) {
                list = outgoingMediaApproval.items;
            }
            C7384Etj.A0Y(list, 3);
            return new OutgoingMediaApproval(i, str, str2, list);
        }

        public final int component1() {
            return this.version;
        }

        public final String component2() {
            return this.recipientDisplay;
        }

        public final String component3() {
            return this.messageText;
        }

        public final List<OutgoingMediaItem> component4() {
            return this.items;
        }

        public final List<OutgoingMediaItem> getItems() {
            return this.items;
        }

        public final String getMessageText() {
            return this.messageText;
        }

        public final String getRecipientDisplay() {
            return this.recipientDisplay;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.items, ((((this.version * 31) + AnonymousClass006.A0G(this.recipientDisplay)) * 31) + AnonymousClass005.A0H(this.messageText)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OutgoingMediaDescriptor extends C06G {
        public static final int $stable = 0;
        public final String contentType;
        public final Integer height;
        public final Long updatedAtMs;
        public final String url;
        public final Integer width;

        public OutgoingMediaDescriptor(String str, Integer num, Integer num2, String str2, Long l) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
            this.width = num;
            this.height = num2;
            this.contentType = str2;
            this.updatedAtMs = l;
        }

        public final OutgoingMediaDescriptor copy(String str, Integer num, Integer num2, String str2, Long l) {
            C7384Etj.A0Y(str, 0);
            return new OutgoingMediaDescriptor(str, num, num2, str2, l);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OutgoingMediaDescriptor) {
                    OutgoingMediaDescriptor outgoingMediaDescriptor = (OutgoingMediaDescriptor) obj;
                    if (!C7384Etj.areEqual(this.url, outgoingMediaDescriptor.url) || !C7384Etj.areEqual(this.width, outgoingMediaDescriptor.width) || !C7384Etj.areEqual(this.height, outgoingMediaDescriptor.height) || !C7384Etj.areEqual(this.contentType, outgoingMediaDescriptor.contentType) || !C7384Etj.areEqual(this.updatedAtMs, outgoingMediaDescriptor.updatedAtMs)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OutgoingMediaDescriptor copy$default(OutgoingMediaDescriptor outgoingMediaDescriptor, String str, Integer num, Integer num2, String str2, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = outgoingMediaDescriptor.url;
            }
            if ((i & 2) != 0) {
                num = outgoingMediaDescriptor.width;
            }
            if ((i & 4) != 0) {
                num2 = outgoingMediaDescriptor.height;
            }
            if ((i & 8) != 0) {
                str2 = outgoingMediaDescriptor.contentType;
            }
            if ((i & 16) != 0) {
                l = outgoingMediaDescriptor.updatedAtMs;
            }
            return outgoingMediaDescriptor.copy(str, num, num2, str2, l);
        }

        public final String component1() {
            return this.url;
        }

        public final Integer component2() {
            return this.width;
        }

        public final Integer component3() {
            return this.height;
        }

        public final String component4() {
            return this.contentType;
        }

        public final Long component5() {
            return this.updatedAtMs;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            return ((((((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + AnonymousClass006.A0G(this.contentType)) * 31) + C3cH.A02(this.updatedAtMs);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OutgoingMediaItem extends C06G {
        public static final int $stable = 0;
        public final String caption;
        public final String fileName;
        public final Long fileSize;
        public final OutgoingMediaKind kind;
        public final OutgoingMediaDescriptor media;

        public OutgoingMediaItem(OutgoingMediaKind outgoingMediaKind, String str, String str2, Long l, OutgoingMediaDescriptor outgoingMediaDescriptor) {
            C7384Etj.A0Y(outgoingMediaKind, 0);
            this.kind = outgoingMediaKind;
            this.caption = str;
            this.fileName = str2;
            this.fileSize = l;
            this.media = outgoingMediaDescriptor;
        }

        public final OutgoingMediaItem copy(OutgoingMediaKind outgoingMediaKind, String str, String str2, Long l, OutgoingMediaDescriptor outgoingMediaDescriptor) {
            C7384Etj.A0Y(outgoingMediaKind, 0);
            return new OutgoingMediaItem(outgoingMediaKind, str, str2, l, outgoingMediaDescriptor);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OutgoingMediaItem) {
                    OutgoingMediaItem outgoingMediaItem = (OutgoingMediaItem) obj;
                    if (this.kind != outgoingMediaItem.kind || !C7384Etj.areEqual(this.caption, outgoingMediaItem.caption) || !C7384Etj.areEqual(this.fileName, outgoingMediaItem.fileName) || !C7384Etj.areEqual(this.fileSize, outgoingMediaItem.fileSize) || !C7384Etj.areEqual(this.media, outgoingMediaItem.media)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OutgoingMediaItem copy$default(OutgoingMediaItem outgoingMediaItem, OutgoingMediaKind outgoingMediaKind, String str, String str2, Long l, OutgoingMediaDescriptor outgoingMediaDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                outgoingMediaKind = outgoingMediaItem.kind;
            }
            if ((i & 2) != 0) {
                str = outgoingMediaItem.caption;
            }
            if ((i & 4) != 0) {
                str2 = outgoingMediaItem.fileName;
            }
            if ((i & 8) != 0) {
                l = outgoingMediaItem.fileSize;
            }
            if ((i & 16) != 0) {
                outgoingMediaDescriptor = outgoingMediaItem.media;
            }
            return outgoingMediaItem.copy(outgoingMediaKind, str, str2, l, outgoingMediaDescriptor);
        }

        public final OutgoingMediaKind component1() {
            return this.kind;
        }

        public final String component2() {
            return this.caption;
        }

        public final String component3() {
            return this.fileName;
        }

        public final Long component4() {
            return this.fileSize;
        }

        public final OutgoingMediaDescriptor component5() {
            return this.media;
        }

        public final String getCaption() {
            return this.caption;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final Long getFileSize() {
            return this.fileSize;
        }

        public final OutgoingMediaKind getKind() {
            return this.kind;
        }

        public final OutgoingMediaDescriptor getMedia() {
            return this.media;
        }

        public int hashCode() {
            return ((((((AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0G(this.caption)) * 31) + AnonymousClass006.A0G(this.fileName)) * 31) + AnonymousClass006.A0D(this.fileSize)) * 31) + C3cH.A02(this.media);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class OutgoingMediaKind {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ OutgoingMediaKind[] $VALUES;
        public static final OutgoingMediaKind AUDIO;
        public static final OutgoingMediaKind DOCUMENT;
        public static final OutgoingMediaKind IMAGE;
        public static final OutgoingMediaKind VIDEO;
        public static final OutgoingMediaKind VOICE;
        public final String wireValue;

        static {
            OutgoingMediaKind outgoingMediaKind = new OutgoingMediaKind("IMAGE", 0, "image");
            IMAGE = outgoingMediaKind;
            OutgoingMediaKind outgoingMediaKind2 = new OutgoingMediaKind("VIDEO", 1, "video");
            VIDEO = outgoingMediaKind2;
            OutgoingMediaKind outgoingMediaKind3 = new OutgoingMediaKind("AUDIO", 2, "audio");
            AUDIO = outgoingMediaKind3;
            OutgoingMediaKind outgoingMediaKind4 = new OutgoingMediaKind("VOICE", 3, "voice");
            VOICE = outgoingMediaKind4;
            OutgoingMediaKind outgoingMediaKind5 = new OutgoingMediaKind("DOCUMENT", 4, "document");
            DOCUMENT = outgoingMediaKind5;
            OutgoingMediaKind[] outgoingMediaKindArr = {outgoingMediaKind, outgoingMediaKind2, outgoingMediaKind3, outgoingMediaKind4, outgoingMediaKind5};
            $VALUES = outgoingMediaKindArr;
            $ENTRIES = C3cG.A0w(outgoingMediaKindArr);
        }

        public static Ey9<OutgoingMediaKind> getEntries() {
            return $ENTRIES;
        }

        public static OutgoingMediaKind valueOf(String str) {
            return (OutgoingMediaKind) Enum.valueOf(OutgoingMediaKind.class, str);
        }

        public static OutgoingMediaKind[] values() {
            return (OutgoingMediaKind[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public OutgoingMediaKind(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    public final class ReservationCheckoutApproval extends C06G implements CheckoutApprovalPayload {
        public static final int $stable = 8;
        public final BigDecimal amount;
        public final String cardBrand;
        public final String cardLast4;
        public final Currency currency;
        public final boolean hasDetails;
        public final boolean hasPriceBreakdown;
        public final List<CheckoutLegalLink> legalLinks;
        public final CheckoutMerchant merchant;
        public final String paymentMethodLabel;
        public final List<WalletPaymentOption> paymentOptions;
        public final CheckoutPaymentSelection paymentSelection;
        public final String subtitle;
        public final String title;
        public final List<ReservationCheckoutTotal> totals;
        public final int version;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReservationCheckoutApproval) {
                    ReservationCheckoutApproval reservationCheckoutApproval = (ReservationCheckoutApproval) obj;
                    if (this.version != reservationCheckoutApproval.version || !C7384Etj.areEqual(this.title, reservationCheckoutApproval.title) || !C7384Etj.areEqual(this.subtitle, reservationCheckoutApproval.subtitle) || !C7384Etj.areEqual(this.merchant, reservationCheckoutApproval.merchant) || !C7384Etj.areEqual(this.amount, reservationCheckoutApproval.amount) || !C7384Etj.areEqual(this.currency, reservationCheckoutApproval.currency) || !C7384Etj.areEqual(this.totals, reservationCheckoutApproval.totals) || this.hasPriceBreakdown != reservationCheckoutApproval.hasPriceBreakdown || this.hasDetails != reservationCheckoutApproval.hasDetails || !C7384Etj.areEqual(this.legalLinks, reservationCheckoutApproval.legalLinks) || !C7384Etj.areEqual(this.paymentMethodLabel, reservationCheckoutApproval.paymentMethodLabel) || !C7384Etj.areEqual(this.cardBrand, reservationCheckoutApproval.cardBrand) || !C7384Etj.areEqual(this.cardLast4, reservationCheckoutApproval.cardLast4) || !C7384Etj.areEqual(this.paymentSelection, reservationCheckoutApproval.paymentSelection) || !C7384Etj.areEqual(this.paymentOptions, reservationCheckoutApproval.paymentOptions)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int component1() {
            return this.version;
        }

        public final List<CheckoutLegalLink> component10() {
            return this.legalLinks;
        }

        public final String component11() {
            return this.paymentMethodLabel;
        }

        public final String component12() {
            return this.cardBrand;
        }

        public final String component13() {
            return this.cardLast4;
        }

        public final CheckoutPaymentSelection component14() {
            return this.paymentSelection;
        }

        public final List<WalletPaymentOption> component15() {
            return this.paymentOptions;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final CheckoutMerchant component4() {
            return this.merchant;
        }

        public final BigDecimal component5() {
            return this.amount;
        }

        public final Currency component6() {
            return this.currency;
        }

        public final List<ReservationCheckoutTotal> component7() {
            return this.totals;
        }

        public final boolean component8() {
            return this.hasPriceBreakdown;
        }

        public final boolean component9() {
            return this.hasDetails;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getCardBrand() {
            return this.cardBrand;
        }

        public final String getCardLast4() {
            return this.cardLast4;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final boolean getHasDetails() {
            return this.hasDetails;
        }

        public final boolean getHasPriceBreakdown() {
            return this.hasPriceBreakdown;
        }

        public final List<CheckoutLegalLink> getLegalLinks() {
            return this.legalLinks;
        }

        public final CheckoutMerchant getMerchant() {
            return this.merchant;
        }

        public final String getPaymentMethodLabel() {
            return this.paymentMethodLabel;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public List<WalletPaymentOption> getPaymentOptions() {
            return this.paymentOptions;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public CheckoutPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ReservationCheckoutTotal> getTotals() {
            return this.totals;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.paymentOptions, (((((((AnonymousClass005.A0F(this.legalLinks, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.totals, AnonymousClass005.A0F(this.currency, AnonymousClass005.A0F(this.amount, (AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.title, this.version * 31)) + AnonymousClass006.A0D(this.merchant)) * 31))), this.hasPriceBreakdown), this.hasDetails)) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31) + C3cH.A02(this.paymentSelection)) * 31);
        }

        public ReservationCheckoutApproval(int i, String str, String str2, CheckoutMerchant checkoutMerchant, BigDecimal bigDecimal, Currency currency, List<ReservationCheckoutTotal> list, boolean z, boolean z2, List<CheckoutLegalLink> list2, String str3, String str4, String str5, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list3) {
            AnonymousClass003.A0x(str, str2);
            AnonymousClass003.A0y(bigDecimal, currency);
            AnonymousClass002.A1F(list, 6, list2);
            C7384Etj.A0Y(list3, 14);
            this.version = i;
            this.title = str;
            this.subtitle = str2;
            this.merchant = checkoutMerchant;
            this.amount = bigDecimal;
            this.currency = currency;
            this.totals = list;
            this.hasPriceBreakdown = z;
            this.hasDetails = z2;
            this.legalLinks = list2;
            this.paymentMethodLabel = str3;
            this.cardBrand = str4;
            this.cardLast4 = str5;
            this.paymentSelection = checkoutPaymentSelection;
            this.paymentOptions = list3;
        }

        public final ReservationCheckoutApproval copy(int i, String str, String str2, CheckoutMerchant checkoutMerchant, BigDecimal bigDecimal, Currency currency, List<ReservationCheckoutTotal> list, boolean z, boolean z2, List<CheckoutLegalLink> list2, String str3, String str4, String str5, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list3) {
            AnonymousClass003.A0x(str, str2);
            AnonymousClass003.A0y(bigDecimal, currency);
            AnonymousClass002.A1F(list, 6, list2);
            C7384Etj.A0Y(list3, 14);
            return new ReservationCheckoutApproval(i, str, str2, checkoutMerchant, bigDecimal, currency, list, z, z2, list2, str3, str4, str5, checkoutPaymentSelection, list3);
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ ReservationCheckoutApproval copy$default(ReservationCheckoutApproval reservationCheckoutApproval, int i, String str, String str2, CheckoutMerchant checkoutMerchant, BigDecimal bigDecimal, Currency currency, List list, boolean z, boolean z2, List list2, String str3, String str4, String str5, CheckoutPaymentSelection checkoutPaymentSelection, List list3, int i2, Object obj) {
            String str6 = str2;
            CheckoutMerchant checkoutMerchant2 = checkoutMerchant;
            BigDecimal bigDecimal2 = bigDecimal;
            Currency currency2 = currency;
            List list4 = list;
            boolean z3 = z;
            boolean z4 = z2;
            List list5 = list2;
            String str7 = str3;
            String str8 = str4;
            String str9 = str5;
            CheckoutPaymentSelection checkoutPaymentSelection2 = checkoutPaymentSelection;
            List list6 = list3;
            if ((i2 & 1) != 0) {
                i = reservationCheckoutApproval.version;
            }
            if ((i2 & 2) != 0) {
                str = reservationCheckoutApproval.title;
            }
            if ((i2 & 4) != 0) {
                str6 = reservationCheckoutApproval.subtitle;
            }
            if ((i2 & 8) != 0) {
                checkoutMerchant2 = reservationCheckoutApproval.merchant;
            }
            if ((i2 & 16) != 0) {
                bigDecimal2 = reservationCheckoutApproval.amount;
            }
            if ((i2 & 32) != 0) {
                currency2 = reservationCheckoutApproval.currency;
            }
            if ((i2 & 64) != 0) {
                list4 = reservationCheckoutApproval.totals;
            }
            if ((i2 & 128) != 0) {
                z3 = reservationCheckoutApproval.hasPriceBreakdown;
            }
            if ((i2 & 256) != 0) {
                z4 = reservationCheckoutApproval.hasDetails;
            }
            if ((i2 & 512) != 0) {
                list5 = reservationCheckoutApproval.legalLinks;
            }
            if ((i2 & 1024) != 0) {
                str7 = reservationCheckoutApproval.paymentMethodLabel;
            }
            if ((i2 & 2048) != 0) {
                str8 = reservationCheckoutApproval.cardBrand;
            }
            if ((i2 & 4096) != 0) {
                str9 = reservationCheckoutApproval.cardLast4;
            }
            if ((i2 & 8192) != 0) {
                checkoutPaymentSelection2 = reservationCheckoutApproval.paymentSelection;
            }
            if ((i2 & 16384) != 0) {
                list6 = reservationCheckoutApproval.paymentOptions;
            }
            return reservationCheckoutApproval.copy(i, str, str6, checkoutMerchant2, bigDecimal2, currency2, list4, z3, z4, list5, str7, str8, str9, checkoutPaymentSelection2, list6);
        }

        public /* synthetic */ ReservationCheckoutApproval(int i, String str, String str2, CheckoutMerchant checkoutMerchant, BigDecimal bigDecimal, Currency currency, List list, boolean z, boolean z2, List list2, String str3, String str4, String str5, CheckoutPaymentSelection checkoutPaymentSelection, List list3, int i2, C06H c06h) {
            this(i, str, str2, checkoutMerchant, bigDecimal, currency, list, z, z2, list2, str3, str4, str5, (i2 & 8192) != 0 ? null : checkoutPaymentSelection, (i2 & 16384) != 0 ? C0881AGi.A00 : list3);
        }
    }

    public final class ReservationCheckoutTotal extends C06G {
        public static final int $stable = 0;
        public final BigDecimal amount;
        public final String displayText;
        public final String type;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReservationCheckoutTotal) {
                    ReservationCheckoutTotal reservationCheckoutTotal = (ReservationCheckoutTotal) obj;
                    if (!C7384Etj.areEqual(this.type, reservationCheckoutTotal.type) || !C7384Etj.areEqual(this.displayText, reservationCheckoutTotal.displayText) || !C7384Etj.areEqual(this.amount, reservationCheckoutTotal.amount)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ReservationCheckoutTotal copy$default(ReservationCheckoutTotal reservationCheckoutTotal, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reservationCheckoutTotal.type;
            }
            if ((i & 2) != 0) {
                str2 = reservationCheckoutTotal.displayText;
            }
            if ((i & 4) != 0) {
                bigDecimal = reservationCheckoutTotal.amount;
            }
            return reservationCheckoutTotal.copy(str, str2, bigDecimal);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.displayText;
        }

        public final BigDecimal component3() {
            return this.amount;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getDisplayText() {
            return this.displayText;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.amount, AnonymousClass005.A0I(this.displayText, AnonymousClass006.A0G(this.type) * 31));
        }

        public ReservationCheckoutTotal(String str, String str2, BigDecimal bigDecimal) {
            AnonymousClass003.A0x(str2, bigDecimal);
            this.type = str;
            this.displayText = str2;
            this.amount = bigDecimal;
        }

        public final ReservationCheckoutTotal copy(String str, String str2, BigDecimal bigDecimal) {
            AnonymousClass003.A0x(str2, bigDecimal);
            return new ReservationCheckoutTotal(str, str2, bigDecimal);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShopifyCheckoutApproval extends C06G implements CheckoutApprovalPayload {
        public static final int $stable = CheckoutLodging.$stable;
        public final String amount;
        public final String cardBrand;
        public final String cardLast4;
        public final String checkoutId;
        public final String checkoutProvider;
        public final ShopifyCheckoutContact contact;
        public final String currency;
        public final ShopifyCheckoutDelivery delivery;
        public final String flowId;
        public final F0C itemNames$delegate;
        public final List<ShopifyCheckoutItem> items;
        public final List<CheckoutLegalLink> legalLinks;
        public final CheckoutLodging lodging;
        public final CheckoutMerchant merchant;
        public final F0C merchantDisplayName$delegate;
        public final String paymentMethodLabel;
        public final List<WalletPaymentOption> paymentOptions;
        public final CheckoutPaymentSelection paymentSelection;
        public final ShopifyCheckoutShippingAddress shippingAddress;
        public final List<CheckoutTotal> totals;
        public final int version;

        /* JADX INFO: Access modifiers changed from: private */
        public final String toDisplayHost(String str) {
            String strA0l;
            String strA0l2;
            String strA0Y;
            if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
                if (!C7BY.A0q(strA0l, "://", false)) {
                    strA0l = FGI.A0M("https://", strA0l);
                }
                String host = Uri.parse(strA0l).getHost();
                if (host != null && (strA0l2 = AnonymousClass002.A0l(host)) != null && (strA0Y = C7BY.A0Y(strA0l2, '.')) != null && strA0Y.length() > 0) {
                    if (AnonymousClass006.A1b("www.", strA0Y)) {
                        strA0Y = strA0Y.substring(4);
                        if (strA0Y.length() > 0) {
                        }
                    }
                    return strA0Y;
                }
            }
            return null;
        }

        public final ShopifyCheckoutApproval copy(int i, String str, String str2, CheckoutMerchant checkoutMerchant, ShopifyCheckoutContact shopifyCheckoutContact, ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress, ShopifyCheckoutDelivery shopifyCheckoutDelivery, List<ShopifyCheckoutItem> list, String str3, String str4, List<CheckoutTotal> list2, List<CheckoutLegalLink> list3, String str5, String str6, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list4, String str8, CheckoutLodging checkoutLodging) {
            C7384Etj.A0Y(list, 7);
            AnonymousClass002.A1G(list2, 10, list3);
            C7384Etj.A0Y(list4, 16);
            return new ShopifyCheckoutApproval(i, str, str2, checkoutMerchant, shopifyCheckoutContact, shopifyCheckoutShippingAddress, shopifyCheckoutDelivery, list, str3, str4, list2, list3, str5, str6, str7, checkoutPaymentSelection, list4, str8, checkoutLodging);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopifyCheckoutApproval) {
                    ShopifyCheckoutApproval shopifyCheckoutApproval = (ShopifyCheckoutApproval) obj;
                    if (this.version != shopifyCheckoutApproval.version || !C7384Etj.areEqual(this.flowId, shopifyCheckoutApproval.flowId) || !C7384Etj.areEqual(this.checkoutId, shopifyCheckoutApproval.checkoutId) || !C7384Etj.areEqual(this.merchant, shopifyCheckoutApproval.merchant) || !C7384Etj.areEqual(this.contact, shopifyCheckoutApproval.contact) || !C7384Etj.areEqual(this.shippingAddress, shopifyCheckoutApproval.shippingAddress) || !C7384Etj.areEqual(this.delivery, shopifyCheckoutApproval.delivery) || !C7384Etj.areEqual(this.items, shopifyCheckoutApproval.items) || !C7384Etj.areEqual(this.amount, shopifyCheckoutApproval.amount) || !C7384Etj.areEqual(this.currency, shopifyCheckoutApproval.currency) || !C7384Etj.areEqual(this.totals, shopifyCheckoutApproval.totals) || !C7384Etj.areEqual(this.legalLinks, shopifyCheckoutApproval.legalLinks) || !C7384Etj.areEqual(this.paymentMethodLabel, shopifyCheckoutApproval.paymentMethodLabel) || !C7384Etj.areEqual(this.cardBrand, shopifyCheckoutApproval.cardBrand) || !C7384Etj.areEqual(this.cardLast4, shopifyCheckoutApproval.cardLast4) || !C7384Etj.areEqual(this.paymentSelection, shopifyCheckoutApproval.paymentSelection) || !C7384Etj.areEqual(this.paymentOptions, shopifyCheckoutApproval.paymentOptions) || !C7384Etj.areEqual(this.checkoutProvider, shopifyCheckoutApproval.checkoutProvider) || !C7384Etj.areEqual(this.lodging, shopifyCheckoutApproval.lodging)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int component1() {
            return this.version;
        }

        public final String component10() {
            return this.currency;
        }

        public final List<CheckoutTotal> component11() {
            return this.totals;
        }

        public final List<CheckoutLegalLink> component12() {
            return this.legalLinks;
        }

        public final String component13() {
            return this.paymentMethodLabel;
        }

        public final String component14() {
            return this.cardBrand;
        }

        public final String component15() {
            return this.cardLast4;
        }

        public final CheckoutPaymentSelection component16() {
            return this.paymentSelection;
        }

        public final List<WalletPaymentOption> component17() {
            return this.paymentOptions;
        }

        public final String component18() {
            return this.checkoutProvider;
        }

        public final CheckoutLodging component19() {
            return this.lodging;
        }

        public final String component2() {
            return this.flowId;
        }

        public final String component3() {
            return this.checkoutId;
        }

        public final CheckoutMerchant component4() {
            return this.merchant;
        }

        public final ShopifyCheckoutContact component5() {
            return this.contact;
        }

        public final ShopifyCheckoutShippingAddress component6() {
            return this.shippingAddress;
        }

        public final ShopifyCheckoutDelivery component7() {
            return this.delivery;
        }

        public final List<ShopifyCheckoutItem> component8() {
            return this.items;
        }

        public final String component9() {
            return this.amount;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCardBrand() {
            return this.cardBrand;
        }

        public final String getCardLast4() {
            return this.cardLast4;
        }

        public final String getCheckoutId() {
            return this.checkoutId;
        }

        public final String getCheckoutProvider() {
            return this.checkoutProvider;
        }

        public final ShopifyCheckoutContact getContact() {
            return this.contact;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final ShopifyCheckoutDelivery getDelivery() {
            return this.delivery;
        }

        public final String getFlowId() {
            return this.flowId;
        }

        public final String getItemNames() {
            return (String) this.itemNames$delegate.getValue();
        }

        public final List<ShopifyCheckoutItem> getItems() {
            return this.items;
        }

        public final List<CheckoutLegalLink> getLegalLinks() {
            return this.legalLinks;
        }

        public final CheckoutLodging getLodging() {
            return this.lodging;
        }

        public final CheckoutMerchant getMerchant() {
            return this.merchant;
        }

        public final String getMerchantDisplayName() {
            return (String) this.merchantDisplayName$delegate.getValue();
        }

        public final String getPaymentMethodLabel() {
            return this.paymentMethodLabel;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public List<WalletPaymentOption> getPaymentOptions() {
            return this.paymentOptions;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public CheckoutPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final ShopifyCheckoutShippingAddress getShippingAddress() {
            return this.shippingAddress;
        }

        public final List<CheckoutTotal> getTotals() {
            return this.totals;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.paymentOptions, (((((((AnonymousClass005.A0F(this.legalLinks, AnonymousClass005.A0F(this.totals, (((AnonymousClass005.A0F(this.items, ((((((((((((this.version * 31) + AnonymousClass006.A0G(this.flowId)) * 31) + AnonymousClass006.A0G(this.checkoutId)) * 31) + AnonymousClass006.A0D(this.merchant)) * 31) + AnonymousClass006.A0D(this.contact)) * 31) + AnonymousClass006.A0D(this.shippingAddress)) * 31) + AnonymousClass006.A0D(this.delivery)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31)) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31) + AnonymousClass006.A0D(this.paymentSelection)) * 31) + AnonymousClass006.A0G(this.checkoutProvider)) * 31) + C3cH.A02(this.lodging);
        }

        public /* synthetic */ ShopifyCheckoutApproval(int i, String str, String str2, CheckoutMerchant checkoutMerchant, ShopifyCheckoutContact shopifyCheckoutContact, ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress, ShopifyCheckoutDelivery shopifyCheckoutDelivery, List list, String str3, String str4, List list2, List list3, String str5, String str6, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List list4, String str8, CheckoutLodging checkoutLodging, int i2, C06H c06h) {
            this(i, str, str2, checkoutMerchant, shopifyCheckoutContact, shopifyCheckoutShippingAddress, shopifyCheckoutDelivery, list, str3, str4, list2, list3, str5, str6, str7, (i2 & 32768) != 0 ? null : checkoutPaymentSelection, (i2 & 65536) != 0 ? C0881AGi.A00 : list4, (i2 & 131072) != 0 ? null : str8, (i2 & 262144) != 0 ? null : checkoutLodging);
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ ShopifyCheckoutApproval copy$default(ShopifyCheckoutApproval shopifyCheckoutApproval, int i, String str, String str2, CheckoutMerchant checkoutMerchant, ShopifyCheckoutContact shopifyCheckoutContact, ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress, ShopifyCheckoutDelivery shopifyCheckoutDelivery, List list, String str3, String str4, List list2, List list3, String str5, String str6, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List list4, String str8, CheckoutLodging checkoutLodging, int i2, Object obj) {
            int i3 = i;
            String str9 = str;
            String str10 = str2;
            CheckoutMerchant checkoutMerchant2 = checkoutMerchant;
            ShopifyCheckoutContact shopifyCheckoutContact2 = shopifyCheckoutContact;
            ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress2 = shopifyCheckoutShippingAddress;
            ShopifyCheckoutDelivery shopifyCheckoutDelivery2 = shopifyCheckoutDelivery;
            List list5 = list;
            String str11 = str3;
            String str12 = str4;
            List list6 = list2;
            List list7 = list3;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            CheckoutPaymentSelection checkoutPaymentSelection2 = checkoutPaymentSelection;
            List list8 = list4;
            String str16 = str8;
            CheckoutLodging checkoutLodging2 = checkoutLodging;
            if ((i2 & 1) != 0) {
                i3 = shopifyCheckoutApproval.version;
            }
            if ((i2 & 2) != 0) {
                str9 = shopifyCheckoutApproval.flowId;
            }
            if ((i2 & 4) != 0) {
                str10 = shopifyCheckoutApproval.checkoutId;
            }
            if ((i2 & 8) != 0) {
                checkoutMerchant2 = shopifyCheckoutApproval.merchant;
            }
            if ((i2 & 16) != 0) {
                shopifyCheckoutContact2 = shopifyCheckoutApproval.contact;
            }
            if ((i2 & 32) != 0) {
                shopifyCheckoutShippingAddress2 = shopifyCheckoutApproval.shippingAddress;
            }
            if ((i2 & 64) != 0) {
                shopifyCheckoutDelivery2 = shopifyCheckoutApproval.delivery;
            }
            if ((i2 & 128) != 0) {
                list5 = shopifyCheckoutApproval.items;
            }
            if ((i2 & 256) != 0) {
                str11 = shopifyCheckoutApproval.amount;
            }
            if ((i2 & 512) != 0) {
                str12 = shopifyCheckoutApproval.currency;
            }
            if ((i2 & 1024) != 0) {
                list6 = shopifyCheckoutApproval.totals;
            }
            if ((i2 & 2048) != 0) {
                list7 = shopifyCheckoutApproval.legalLinks;
            }
            if ((i2 & 4096) != 0) {
                str13 = shopifyCheckoutApproval.paymentMethodLabel;
            }
            if ((i2 & 8192) != 0) {
                str14 = shopifyCheckoutApproval.cardBrand;
            }
            if ((i2 & 16384) != 0) {
                str15 = shopifyCheckoutApproval.cardLast4;
            }
            if ((i2 & 32768) != 0) {
                checkoutPaymentSelection2 = shopifyCheckoutApproval.paymentSelection;
            }
            if ((i2 & 65536) != 0) {
                list8 = shopifyCheckoutApproval.paymentOptions;
            }
            if ((i2 & 131072) != 0) {
                str16 = shopifyCheckoutApproval.checkoutProvider;
            }
            if ((i2 & 262144) != 0) {
                checkoutLodging2 = shopifyCheckoutApproval.lodging;
            }
            ShopifyCheckoutDelivery shopifyCheckoutDelivery3 = shopifyCheckoutDelivery2;
            return shopifyCheckoutApproval.copy(i3, str9, str10, checkoutMerchant2, shopifyCheckoutContact2, shopifyCheckoutShippingAddress2, shopifyCheckoutDelivery3, list5, str11, str12, list6, list7, str13, str14, str15, checkoutPaymentSelection2, list8, str16, checkoutLodging2);
        }

        public ShopifyCheckoutApproval(int i, String str, String str2, CheckoutMerchant checkoutMerchant, ShopifyCheckoutContact shopifyCheckoutContact, ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress, ShopifyCheckoutDelivery shopifyCheckoutDelivery, List<ShopifyCheckoutItem> list, String str3, String str4, List<CheckoutTotal> list2, List<CheckoutLegalLink> list3, String str5, String str6, String str7, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list4, String str8, CheckoutLodging checkoutLodging) {
            C7384Etj.A0Y(list, 7);
            AnonymousClass002.A1G(list2, 10, list3);
            C7384Etj.A0Y(list4, 16);
            this.version = i;
            this.flowId = str;
            this.checkoutId = str2;
            this.merchant = checkoutMerchant;
            this.contact = shopifyCheckoutContact;
            this.shippingAddress = shopifyCheckoutShippingAddress;
            this.delivery = shopifyCheckoutDelivery;
            this.items = list;
            this.amount = str3;
            this.currency = str4;
            this.totals = list2;
            this.legalLinks = list3;
            this.paymentMethodLabel = str5;
            this.cardBrand = str6;
            this.cardLast4 = str7;
            this.paymentSelection = checkoutPaymentSelection;
            this.paymentOptions = list4;
            this.checkoutProvider = str8;
            this.lodging = checkoutLodging;
            this.merchantDisplayName$delegate = AbstractC5321DgF.A03(new HatchAgentPermissionsRepository$ShopifyCheckoutApproval$merchantDisplayName$2(this));
            this.itemNames$delegate = AbstractC5321DgF.A03(new HatchAgentPermissionsRepository$ShopifyCheckoutApproval$itemNames$2(this));
        }
    }

    public final class ShopifyCheckoutContact extends C06G {
        public static final int $stable = 0;
        public final String countryCode;
        public final String displayName;
        public final String email;
        public final String phoneNumber;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopifyCheckoutContact) {
                    ShopifyCheckoutContact shopifyCheckoutContact = (ShopifyCheckoutContact) obj;
                    if (!C7384Etj.areEqual(this.email, shopifyCheckoutContact.email) || !C7384Etj.areEqual(this.phoneNumber, shopifyCheckoutContact.phoneNumber) || !C7384Etj.areEqual(this.countryCode, shopifyCheckoutContact.countryCode) || !C7384Etj.areEqual(this.displayName, shopifyCheckoutContact.displayName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ShopifyCheckoutContact copy$default(ShopifyCheckoutContact shopifyCheckoutContact, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shopifyCheckoutContact.email;
            }
            if ((i & 2) != 0) {
                str2 = shopifyCheckoutContact.phoneNumber;
            }
            if ((i & 4) != 0) {
                str3 = shopifyCheckoutContact.countryCode;
            }
            if ((i & 8) != 0) {
                str4 = shopifyCheckoutContact.displayName;
            }
            return new ShopifyCheckoutContact(str, str2, str3, str4);
        }

        public final String component1() {
            return this.email;
        }

        public final String component2() {
            return this.phoneNumber;
        }

        public final String component3() {
            return this.countryCode;
        }

        public final String component4() {
            return this.displayName;
        }

        public final ShopifyCheckoutContact copy(String str, String str2, String str3, String str4) {
            return new ShopifyCheckoutContact(str, str2, str3, str4);
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return (((((AnonymousClass006.A0G(this.email) * 31) + AnonymousClass006.A0G(this.phoneNumber)) * 31) + AnonymousClass006.A0G(this.countryCode)) * 31) + AnonymousClass005.A0H(this.displayName);
        }

        public ShopifyCheckoutContact(String str, String str2, String str3, String str4) {
            this.email = str;
            this.phoneNumber = str2;
            this.countryCode = str3;
            this.displayName = str4;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ShopifyCheckoutContact(String str, String str2, String str3, String str4, int i, C06H c06h) {
            this(str, str2, str3, AnonymousClass006.A0u(i, str4));
        }
    }

    public final class ShopifyCheckoutDelivery extends C06G {
        public static final int $stable = 0;
        public final String amount;
        public final String carrier;
        public final String currency;
        public final String estimatedDelivery;
        public final String id;
        public final String label;

        public static /* synthetic */ ShopifyCheckoutDelivery copy$default(ShopifyCheckoutDelivery shopifyCheckoutDelivery, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            if ((i & 1) != 0) {
                str7 = shopifyCheckoutDelivery.id;
            }
            if ((i & 2) != 0) {
                str8 = shopifyCheckoutDelivery.label;
            }
            if ((i & 4) != 0) {
                str9 = shopifyCheckoutDelivery.amount;
            }
            if ((i & 8) != 0) {
                str10 = shopifyCheckoutDelivery.currency;
            }
            if ((i & 16) != 0) {
                str11 = shopifyCheckoutDelivery.carrier;
            }
            if ((i & 32) != 0) {
                str12 = shopifyCheckoutDelivery.estimatedDelivery;
            }
            return new ShopifyCheckoutDelivery(str7, str8, str9, str10, str11, str12);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopifyCheckoutDelivery) {
                    ShopifyCheckoutDelivery shopifyCheckoutDelivery = (ShopifyCheckoutDelivery) obj;
                    if (!C7384Etj.areEqual(this.id, shopifyCheckoutDelivery.id) || !C7384Etj.areEqual(this.label, shopifyCheckoutDelivery.label) || !C7384Etj.areEqual(this.amount, shopifyCheckoutDelivery.amount) || !C7384Etj.areEqual(this.currency, shopifyCheckoutDelivery.currency) || !C7384Etj.areEqual(this.carrier, shopifyCheckoutDelivery.carrier) || !C7384Etj.areEqual(this.estimatedDelivery, shopifyCheckoutDelivery.estimatedDelivery)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.label;
        }

        public final String component3() {
            return this.amount;
        }

        public final String component4() {
            return this.currency;
        }

        public final String component5() {
            return this.carrier;
        }

        public final String component6() {
            return this.estimatedDelivery;
        }

        public final ShopifyCheckoutDelivery copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new ShopifyCheckoutDelivery(str, str2, str3, str4, str5, str6);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getEstimatedDelivery() {
            return this.estimatedDelivery;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return (((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.carrier)) * 31) + AnonymousClass005.A0H(this.estimatedDelivery);
        }

        public ShopifyCheckoutDelivery(String str, String str2, String str3, String str4, String str5, String str6) {
            this.id = str;
            this.label = str2;
            this.amount = str3;
            this.currency = str4;
            this.carrier = str5;
            this.estimatedDelivery = str6;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShopifyCheckoutItem extends C06G {
        public static final int $stable = 8;
        public final String currency;
        public final String id;
        public final String imageUrl;
        public final String name;
        public final String productUrl;
        public final String quantity;
        public final String totalAmount;
        public final String unitAmount;
        public final List<String> variantOptions;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopifyCheckoutItem) {
                    ShopifyCheckoutItem shopifyCheckoutItem = (ShopifyCheckoutItem) obj;
                    if (!C7384Etj.areEqual(this.id, shopifyCheckoutItem.id) || !C7384Etj.areEqual(this.name, shopifyCheckoutItem.name) || !C7384Etj.areEqual(this.quantity, shopifyCheckoutItem.quantity) || !C7384Etj.areEqual(this.unitAmount, shopifyCheckoutItem.unitAmount) || !C7384Etj.areEqual(this.totalAmount, shopifyCheckoutItem.totalAmount) || !C7384Etj.areEqual(this.currency, shopifyCheckoutItem.currency) || !C7384Etj.areEqual(this.imageUrl, shopifyCheckoutItem.imageUrl) || !C7384Etj.areEqual(this.productUrl, shopifyCheckoutItem.productUrl) || !C7384Etj.areEqual(this.variantOptions, shopifyCheckoutItem.variantOptions)) {
                    }
                }
                return false;
            }
            return true;
        }

        public ShopifyCheckoutItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
            C7384Etj.A0Y(list, 8);
            this.id = str;
            this.name = str2;
            this.quantity = str3;
            this.unitAmount = str4;
            this.totalAmount = str5;
            this.currency = str6;
            this.imageUrl = str7;
            this.productUrl = str8;
            this.variantOptions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShopifyCheckoutItem copy$default(ShopifyCheckoutItem shopifyCheckoutItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shopifyCheckoutItem.id;
            }
            if ((i & 2) != 0) {
                str2 = shopifyCheckoutItem.name;
            }
            if ((i & 4) != 0) {
                str3 = shopifyCheckoutItem.quantity;
            }
            if ((i & 8) != 0) {
                str4 = shopifyCheckoutItem.unitAmount;
            }
            if ((i & 16) != 0) {
                str5 = shopifyCheckoutItem.totalAmount;
            }
            if ((i & 32) != 0) {
                str6 = shopifyCheckoutItem.currency;
            }
            if ((i & 64) != 0) {
                str7 = shopifyCheckoutItem.imageUrl;
            }
            if ((i & 128) != 0) {
                str8 = shopifyCheckoutItem.productUrl;
            }
            if ((i & 256) != 0) {
                list = shopifyCheckoutItem.variantOptions;
            }
            return shopifyCheckoutItem.copy(str, str2, str3, str4, str5, str6, str7, str8, list);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.quantity;
        }

        public final String component4() {
            return this.unitAmount;
        }

        public final String component5() {
            return this.totalAmount;
        }

        public final String component6() {
            return this.currency;
        }

        public final String component7() {
            return this.imageUrl;
        }

        public final String component8() {
            return this.productUrl;
        }

        public final List<String> component9() {
            return this.variantOptions;
        }

        public final ShopifyCheckoutItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
            C7384Etj.A0Y(list, 8);
            return new ShopifyCheckoutItem(str, str2, str3, str4, str5, str6, str7, str8, list);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getName() {
            return this.name;
        }

        public final String getProductUrl() {
            return this.productUrl;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final String getTotalAmount() {
            return this.totalAmount;
        }

        public final String getUnitAmount() {
            return this.unitAmount;
        }

        public final List<String> getVariantOptions() {
            return this.variantOptions;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.variantOptions, ((((((((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.quantity)) * 31) + AnonymousClass006.A0G(this.unitAmount)) * 31) + AnonymousClass006.A0G(this.totalAmount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass005.A0H(this.productUrl)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShopifyCheckoutShippingAddress extends C06G {
        public static final int $stable = 0;
        public final String city;
        public final String country;
        public final String firstName;
        public final String lastName;
        public final String postalCode;
        public final String state;
        public final String street1;
        public final String street2;

        public static /* synthetic */ ShopifyCheckoutShippingAddress copy$default(ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            if ((i & 1) != 0) {
                str9 = shopifyCheckoutShippingAddress.firstName;
            }
            if ((i & 2) != 0) {
                str10 = shopifyCheckoutShippingAddress.lastName;
            }
            if ((i & 4) != 0) {
                str11 = shopifyCheckoutShippingAddress.street1;
            }
            if ((i & 8) != 0) {
                str12 = shopifyCheckoutShippingAddress.street2;
            }
            if ((i & 16) != 0) {
                str13 = shopifyCheckoutShippingAddress.city;
            }
            if ((i & 32) != 0) {
                str14 = shopifyCheckoutShippingAddress.state;
            }
            if ((i & 64) != 0) {
                str15 = shopifyCheckoutShippingAddress.postalCode;
            }
            if ((i & 128) != 0) {
                str16 = shopifyCheckoutShippingAddress.country;
            }
            return new ShopifyCheckoutShippingAddress(str9, str10, str11, str12, str13, str14, str15, str16);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopifyCheckoutShippingAddress) {
                    ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress = (ShopifyCheckoutShippingAddress) obj;
                    if (!C7384Etj.areEqual(this.firstName, shopifyCheckoutShippingAddress.firstName) || !C7384Etj.areEqual(this.lastName, shopifyCheckoutShippingAddress.lastName) || !C7384Etj.areEqual(this.street1, shopifyCheckoutShippingAddress.street1) || !C7384Etj.areEqual(this.street2, shopifyCheckoutShippingAddress.street2) || !C7384Etj.areEqual(this.city, shopifyCheckoutShippingAddress.city) || !C7384Etj.areEqual(this.state, shopifyCheckoutShippingAddress.state) || !C7384Etj.areEqual(this.postalCode, shopifyCheckoutShippingAddress.postalCode) || !C7384Etj.areEqual(this.country, shopifyCheckoutShippingAddress.country)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.firstName;
        }

        public final String component2() {
            return this.lastName;
        }

        public final String component3() {
            return this.street1;
        }

        public final String component4() {
            return this.street2;
        }

        public final String component5() {
            return this.city;
        }

        public final String component6() {
            return this.state;
        }

        public final String component7() {
            return this.postalCode;
        }

        public final String component8() {
            return this.country;
        }

        public final ShopifyCheckoutShippingAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            return new ShopifyCheckoutShippingAddress(str, str2, str3, str4, str5, str6, str7, str8);
        }

        public final String getCity() {
            return this.city;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getState() {
            return this.state;
        }

        public final String getStreet1() {
            return this.street1;
        }

        public final String getStreet2() {
            return this.street2;
        }

        public int hashCode() {
            return (((((((((((((AnonymousClass006.A0G(this.firstName) * 31) + AnonymousClass006.A0G(this.lastName)) * 31) + AnonymousClass006.A0G(this.street1)) * 31) + AnonymousClass006.A0G(this.street2)) * 31) + AnonymousClass006.A0G(this.city)) * 31) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.postalCode)) * 31) + AnonymousClass005.A0H(this.country);
        }

        public ShopifyCheckoutShippingAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.firstName = str;
            this.lastName = str2;
            this.street1 = str3;
            this.street2 = str4;
            this.city = str5;
            this.state = str6;
            this.postalCode = str7;
            this.country = str8;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StripeLinkCheckoutApproval extends C06G implements CheckoutApprovalPayload {
        public static final int $stable = 8;
        public final String amount;
        public final String cardBrand;
        public final Long cardExpiresInMs;
        public final String cardLast4;
        public final String currency;
        public final String merchantUrl;
        public final String paymentMethodLabel;
        public final List<WalletPaymentOption> paymentOptions;
        public final CheckoutPaymentSelection paymentSelection;
        public final int version;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StripeLinkCheckoutApproval) {
                    StripeLinkCheckoutApproval stripeLinkCheckoutApproval = (StripeLinkCheckoutApproval) obj;
                    if (this.version != stripeLinkCheckoutApproval.version || !C7384Etj.areEqual(this.merchantUrl, stripeLinkCheckoutApproval.merchantUrl) || !C7384Etj.areEqual(this.amount, stripeLinkCheckoutApproval.amount) || !C7384Etj.areEqual(this.currency, stripeLinkCheckoutApproval.currency) || !C7384Etj.areEqual(this.paymentMethodLabel, stripeLinkCheckoutApproval.paymentMethodLabel) || !C7384Etj.areEqual(this.cardBrand, stripeLinkCheckoutApproval.cardBrand) || !C7384Etj.areEqual(this.cardLast4, stripeLinkCheckoutApproval.cardLast4) || !C7384Etj.areEqual(this.cardExpiresInMs, stripeLinkCheckoutApproval.cardExpiresInMs) || !C7384Etj.areEqual(this.paymentSelection, stripeLinkCheckoutApproval.paymentSelection) || !C7384Etj.areEqual(this.paymentOptions, stripeLinkCheckoutApproval.paymentOptions)) {
                    }
                }
                return false;
            }
            return true;
        }

        public StripeLinkCheckoutApproval(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list) {
            C7384Etj.A0Y(list, 9);
            this.version = i;
            this.merchantUrl = str;
            this.amount = str2;
            this.currency = str3;
            this.paymentMethodLabel = str4;
            this.cardBrand = str5;
            this.cardLast4 = str6;
            this.cardExpiresInMs = l;
            this.paymentSelection = checkoutPaymentSelection;
            this.paymentOptions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StripeLinkCheckoutApproval copy$default(StripeLinkCheckoutApproval stripeLinkCheckoutApproval, int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutPaymentSelection checkoutPaymentSelection, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stripeLinkCheckoutApproval.version;
            }
            if ((i2 & 2) != 0) {
                str = stripeLinkCheckoutApproval.merchantUrl;
            }
            if ((i2 & 4) != 0) {
                str2 = stripeLinkCheckoutApproval.amount;
            }
            if ((i2 & 8) != 0) {
                str3 = stripeLinkCheckoutApproval.currency;
            }
            if ((i2 & 16) != 0) {
                str4 = stripeLinkCheckoutApproval.paymentMethodLabel;
            }
            if ((i2 & 32) != 0) {
                str5 = stripeLinkCheckoutApproval.cardBrand;
            }
            if ((i2 & 64) != 0) {
                str6 = stripeLinkCheckoutApproval.cardLast4;
            }
            if ((i2 & 128) != 0) {
                l = stripeLinkCheckoutApproval.cardExpiresInMs;
            }
            if ((i2 & 256) != 0) {
                checkoutPaymentSelection = stripeLinkCheckoutApproval.paymentSelection;
            }
            if ((i2 & 512) != 0) {
                list = stripeLinkCheckoutApproval.paymentOptions;
            }
            return stripeLinkCheckoutApproval.copy(i, str, str2, str3, str4, str5, str6, l, checkoutPaymentSelection, list);
        }

        public final int component1() {
            return this.version;
        }

        public final List<WalletPaymentOption> component10() {
            return this.paymentOptions;
        }

        public final String component2() {
            return this.merchantUrl;
        }

        public final String component3() {
            return this.amount;
        }

        public final String component4() {
            return this.currency;
        }

        public final String component5() {
            return this.paymentMethodLabel;
        }

        public final String component6() {
            return this.cardBrand;
        }

        public final String component7() {
            return this.cardLast4;
        }

        public final Long component8() {
            return this.cardExpiresInMs;
        }

        public final CheckoutPaymentSelection component9() {
            return this.paymentSelection;
        }

        public final StripeLinkCheckoutApproval copy(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutPaymentSelection checkoutPaymentSelection, List<WalletPaymentOption> list) {
            C7384Etj.A0Y(list, 9);
            return new StripeLinkCheckoutApproval(i, str, str2, str3, str4, str5, str6, l, checkoutPaymentSelection, list);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCardBrand() {
            return this.cardBrand;
        }

        public final Long getCardExpiresInMs() {
            return this.cardExpiresInMs;
        }

        public final String getCardLast4() {
            return this.cardLast4;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getMerchantUrl() {
            return this.merchantUrl;
        }

        public final String getPaymentMethodLabel() {
            return this.paymentMethodLabel;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public List<WalletPaymentOption> getPaymentOptions() {
            return this.paymentOptions;
        }

        @Override // com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
        public CheckoutPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.paymentOptions, ((((((((((((((((this.version * 31) + AnonymousClass006.A0G(this.merchantUrl)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31) + AnonymousClass006.A0D(this.cardExpiresInMs)) * 31) + C3cH.A02(this.paymentSelection)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ StripeLinkCheckoutApproval(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, CheckoutPaymentSelection checkoutPaymentSelection, List list, int i2, C06H c06h) {
            this(i, str, str2, str3, str4, str5, str6, l, (i2 & 256) != 0 ? null : checkoutPaymentSelection, (i2 & 512) != 0 ? C0881AGi.A00 : list);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$decideApprovals$2", f = "HatchAgentPermissionsRepository.kt", l = {239}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$decideApprovals$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DecideResult>, Object> {
        public final /* synthetic */ List<AgentPermissionApprovalDecision> $decisions;
        public final /* synthetic */ boolean $showFailureToast;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<AgentPermissionApprovalDecision> list, boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$decisions = list;
            this.$showFailureToast = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAgentPermissionsRepository.this.new AnonymousClass2(this.$decisions, this.$showFailureToast, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HxE hxESplitLocalAndServerDecisions = HatchAgentPermissionsRepository.this.splitLocalAndServerDecisions(this.$decisions);
                HatchAgentPermissionsRepository$decideApprovals$2$result$1 hatchAgentPermissionsRepository$decideApprovals$2$result$1 = new HatchAgentPermissionsRepository$decideApprovals$2$result$1(HatchAgentPermissionsRepository.this, (List) hxESplitLocalAndServerDecisions.first, (List) hxESplitLocalAndServerDecisions.second, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = Hxb.A00(hatchAgentPermissionsRepository$decideApprovals$2$result$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (this.$showFailureToast && !(obj instanceof DecideResult.Success)) {
                boolean z = obj instanceof DecideResult.Confirming;
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = HatchAgentPermissionsRepository.this;
                if (!z) {
                    hatchAgentPermissionsRepository.showDecisionFailureToast();
                    return obj;
                }
                hatchAgentPermissionsRepository.showDecisionConfirmingToast();
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DecideResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {424}, m = "decideServerApprovals", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$decideServerApprovals$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgentPermissionsRepository.this.decideServerApprovals(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {1594}, m = "fetchDeviceApprovalCopy", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchDeviceApprovalCopy$1, reason: invalid class name and case insensitive filesystem */
    public final class C120321 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C120321(HtJ<? super C120321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgentPermissionsRepository.this.fetchDeviceApprovalCopy(null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$2", f = "HatchAgentPermissionsRepository.kt", l = {HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C120332 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DeviceApprovalCopy>, Object> {
        public final /* synthetic */ C27k<DeviceApprovalCopy> $inFlight;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120332(C27k<DeviceApprovalCopy> c27k, HtJ<? super C120332> htJ) {
            super(2, htJ);
            this.$inFlight = c27k;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C120332(this.$inFlight, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C78T c78t = this.$inFlight;
                this.label = 1;
                obj = ((GBM) c78t).A0E(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DeviceApprovalCopy> htJ) {
            return new C120332(this.$inFlight, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {161}, m = "recoverPendingApprovals", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$1, reason: invalid class name and case insensitive filesystem */
    public final class C120341 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C120341(HtJ<? super C120341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgentPermissionsRepository.this.recoverPendingApprovals(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$2", f = "HatchAgentPermissionsRepository.kt", l = {1571}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$2, reason: invalid class name and case insensitive filesystem */
    public final class C120352 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public C120352(HtJ<? super C120352> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchAgentPermissionsRepository.this.new C120352(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return HatchAgentPermissionsRepository.this.new C120352(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            long j;
            long jCurrentEpoch;
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = HatchAgentPermissionsRepository.this;
                synchronized (hatchAgentPermissionsRepository.serverPendingApprovalsLock) {
                    j = hatchAgentPermissionsRepository.websocketSnapshotVersion;
                }
                jCurrentEpoch = HatchAgentPermissionsRepository.this.decideReadGate.currentEpoch();
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchAgentPermissionsRepository$recoverPendingApprovals$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchAgentPermissionsRepository$recoverPendingApprovals$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchAgentPermissionsRepository$recoverPendingApprovals$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.J$0 = j;
                this.J$1 = jCurrentEpoch;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchAgentPermissionsRepository$recoverPendingApprovals$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, JarvisPath.Approvals.INSTANCE, RequestType.GET, HatchAgentPermissionsRepository.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                jCurrentEpoch = this.J$1;
                j = this.J$0;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            ApprovalSnapshotJson approvalSnapshotJson = (ApprovalSnapshotJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (approvalSnapshotJson != null) {
                HatchAgentPermissionsRepository.this.replaceServerPendingApprovals(approvalSnapshotJson.pendingToDomain(), approvalSnapshotJson.recent_approvals, approvalSnapshotJson.emitted_at_ms, SnapshotSource.HTTP_RECOVERY, C3cG.A0S(jCurrentEpoch), C3cG.A0S(j));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {688}, m = "requestLocalApproval", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$requestLocalApproval$1, reason: invalid class name and case insensitive filesystem */
    public final class C120361 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C120361(HtJ<? super C120361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgentPermissionsRepository.this.requestLocalApproval(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {MC.frl_google_credential_manager.__CONFIG__, 476}, m = "retryReadUntilLostDecidesConfirmed", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$retryReadUntilLostDecidesConfirmed$1, reason: invalid class name and case insensitive filesystem */
    public final class C120371 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C120371(HtJ<? super C120371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgentPermissionsRepository.this.retryReadUntilLostDecidesConfirmed(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$retryReadUntilLostDecidesConfirmed$3", f = "HatchAgentPermissionsRepository.kt", l = {476}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$retryReadUntilLostDecidesConfirmed$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAgentPermissionsRepository.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HzR<Unit> hzR = HatchAgentPermissionsRepository.this.lostDecideReadWake;
                this.label = 1;
                if (hzR.AZg(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchAgentPermissionsRepository.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {1598, 528}, m = "sendServerDecisions", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$sendServerDecisions$1, reason: invalid class name and case insensitive filesystem */
    public final class C120381 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C120381(HtJ<? super C120381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgentPermissionsRepository.this.sendServerDecisions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$setWalletSelection$2", f = "HatchAgentPermissionsRepository.kt", l = {1595}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$setWalletSelection$2, reason: invalid class name and case insensitive filesystem */
    public final class C120392 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DecideResult>, Object> {
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ String $paymentId;
        public final /* synthetic */ String $paymentMethod;
        public final /* synthetic */ String $paymentType;
        public final /* synthetic */ boolean $showFailureToast;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120392(String str, String str2, String str3, String str4, boolean z, HtJ<? super C120392> htJ) {
            super(2, htJ);
            this.$approvalId = str;
            this.$paymentMethod = str2;
            this.$paymentType = str3;
            this.$paymentId = str4;
            this.$showFailureToast = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAgentPermissionsRepository.this.new C120392(this.$approvalId, this.$paymentMethod, this.$paymentType, this.$paymentId, this.$showFailureToast, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchAgentPermissionsRepository hatchAgentPermissionsRepository;
            Boolean boolValueOf;
            Object objM1599executeJarvisRequestWithFof5HsY;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchAgentPermissionsRepository hatchAgentPermissionsRepository2 = HatchAgentPermissionsRepository.this;
                    Object obj2 = hatchAgentPermissionsRepository2.walletSelectionsLock;
                    String str = this.$approvalId;
                    synchronized (obj2) {
                        boolValueOf = Boolean.valueOf(hatchAgentPermissionsRepository2.walletSelectionsInFlight.add(str));
                    }
                    boolean zBooleanValue = boolValueOf.booleanValue();
                    if (!zBooleanValue) {
                        return new DecideResult.Failed("Wallet selection already in flight");
                    }
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    HatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.Z$0 = zBooleanValue;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.I$3 = 1;
                    this.I$4 = 0;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchAgentPermissionsRepository$setWalletSelection$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.Wallet.INSTANCE, new WalletSetRequestJson(this.$approvalId, this.$paymentMethod, this.$paymentType, this.$paymentId), RequestType.POST, HatchAgentPermissionsRepository.this.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
                if (thA00 != null) {
                    if (this.$showFailureToast) {
                        HatchAgentPermissionsRepository.this.showDecisionFailureToast();
                    }
                    DecideResult.Failed failed = new DecideResult.Failed((!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) ? C60N.A00(2) : FGI.A0H("HTTP ", C3cG.A0R(networkException.httpResponseCode).intValue()));
                    synchronized (r2) {
                        return failed;
                    }
                }
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository3 = HatchAgentPermissionsRepository.this;
                Hwg.A00(objM1599executeJarvisRequestWithFof5HsY);
                hatchAgentPermissionsRepository3.applyWalletSelection(((WalletSetResultJson) objM1599executeJarvisRequestWithFof5HsY).toDomain(this.$approvalId));
                DecideResult.Success success = DecideResult.Success.INSTANCE;
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository4 = HatchAgentPermissionsRepository.this;
                Object obj3 = hatchAgentPermissionsRepository4.walletSelectionsLock;
                String str2 = this.$approvalId;
                synchronized (obj3) {
                    hatchAgentPermissionsRepository4.walletSelectionsInFlight.remove(str2);
                }
                return success;
            } finally {
                hatchAgentPermissionsRepository = HatchAgentPermissionsRepository.this;
                Object obj4 = hatchAgentPermissionsRepository.walletSelectionsLock;
                String str3 = this.$approvalId;
                synchronized (obj4) {
                    hatchAgentPermissionsRepository.walletSelectionsInFlight.remove(str3);
                }
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DecideResult> htJ) {
            return ((C120392) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1", f = "HatchAgentPermissionsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C120401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HatchAgentPermissionsRepository this$0;

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1$1", f = "HatchAgentPermissionsRepository.kt", l = {134}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01621 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchGatewayConnection $gateway;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ HatchAgentPermissionsRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01621(HatchGatewayConnection hatchGatewayConnection, HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super C01621> htJ) {
                super(2, htJ);
                this.$gateway = hatchGatewayConnection;
                this.this$0 = hatchAgentPermissionsRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C01621 c01621 = new C01621(this.$gateway, this.this$0, htJ);
                c01621.L$0 = obj;
                return c01621;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                final C3UX c3ux = (C3UX) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C22I<JsonObject> approvalsSnapshotEvents = this.$gateway.getApprovalsSnapshotEvents();
                    final HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0;
                    C20Z<? super JsonObject> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchAgentPermissionsRepository.start.1.1.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((JsonObject) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(JsonObject jsonObject, HtJ<? super Unit> htJ) {
                            Object objA0s;
                            try {
                                C9sU c9sU = HatchJsonKt.HatchJson;
                                int i2 = ApprovalSnapshotJson.$stable;
                                objA0s = (ApprovalSnapshotJson) c9sU.A01(ApprovalSnapshotJson$$serializer.INSTANCE, jsonObject);
                            } catch (Throwable th) {
                                objA0s = C3cG.A0s(th);
                            }
                            Throwable thA00 = HsJ.A00(objA0s);
                            if (thA00 != null) {
                                CFK.A06(HatchAgentPermissionsRepositoryKt.TAG, FGI.A0M("Failed to decode approvals.snapshot: ", thA00.getMessage()));
                            }
                            if (objA0s instanceof C10571Hud) {
                                objA0s = null;
                            }
                            ApprovalSnapshotJson approvalSnapshotJson = (ApprovalSnapshotJson) objA0s;
                            if (approvalSnapshotJson != null) {
                                HatchAgentPermissionsRepository.replaceServerPendingApprovals$default(hatchAgentPermissionsRepository, approvalSnapshotJson.pendingToDomain(), approvalSnapshotJson.recent_approvals, approvalSnapshotJson.emitted_at_ms, SnapshotSource.WEBSOCKET, null, null, 32, null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (approvalsSnapshotEvents.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0p();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C01621) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1$2", f = "HatchAgentPermissionsRepository.kt", l = {152}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchGatewayConnection $gateway;
            public int label;
            public final /* synthetic */ HatchAgentPermissionsRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection, HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$gateway = hatchGatewayConnection;
                this.this$0 = hatchAgentPermissionsRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$gateway, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C20Q c20qA01 = GDB.A01(new HatchAgentPermissionsRepository$start$1$2$invokeSuspend$$inlined$map$1(this.$gateway.connectionState));
                    final HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0;
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchAgentPermissionsRepository.start.1.2.2
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            Object objRecoverPendingApprovals;
                            if (z && (objRecoverPendingApprovals = hatchAgentPermissionsRepository.recoverPendingApprovals(htJ)) == EnumC10460Hji.A02) {
                                return objRecoverPendingApprovals;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1$3", f = "HatchAgentPermissionsRepository.kt", l = {155}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$start$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchGatewayConnection $gateway;
            public int label;
            public final /* synthetic */ HatchAgentPermissionsRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HatchGatewayConnection hatchGatewayConnection, HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$gateway = hatchGatewayConnection;
                this.this$0 = hatchAgentPermissionsRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass3(this.$gateway, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C22I<Unit> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().tasksUpdateEvents;
                    final HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0;
                    C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchAgentPermissionsRepository.start.1.3.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                            return C3cG.A0U(hatchAgentPermissionsRepository.recoverPendingApprovals(htJ));
                        }
                    };
                    this.label = 1;
                    if (c22i.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0p();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120401(HatchGatewayConnection hatchGatewayConnection, HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super C120401> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = hatchAgentPermissionsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C120401 c120401 = new C120401(this.$gateway, this.this$0, htJ);
            c120401.L$0 = obj;
            return c120401;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C01621 c01621 = new C01621(this.$gateway, this.this$0, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, c01621, c3ux);
            GAo.A02(num, c6ys, new AnonymousClass2(this.$gateway, this.this$0, null), c3ux);
            GAo.A02(num, c6ys, new AnonymousClass3(this.$gateway, this.this$0, null), c3ux);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C120401) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object fetchDeviceApprovalCopyWithin(long j, String str, String str2, String str3, String str4, String str5, HtJ<? super DeviceApprovalCopy> htJ) {
        return GAX.A01(htJ, new C120332(AnonymousClass001.A10(new HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1(this, str, str2, str3, str4, str5, null), this.scope), null), j);
    }

    public final boolean isConfirmingDecision(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass006.A1a(str, this.decideReadGate._blockedIds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r3 = r42._serverPendingApprovals;
        r2 = X.AnonymousClass003.A0i(r7);
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r7.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r8 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (X.C7384Etj.areEqual(r8.approvalId, r43.approvalId) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r0 = r8.richPayload;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r38 = withWalletSelection(r0, r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r8 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval.copy$default(r8, null, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, r38, false, null, null, -268435457, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        r2.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r38 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        X.AnonymousClass002.A1I(r3, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyWalletSelection(com.facebook.aura.gateway.WalletSelectionResult r43) {
        /*
            r42 = this;
            r6 = r42
            java.lang.Object r4 = r6.serverPendingApprovalsLock
            monitor-enter(r4)
            X.BLG<java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval>> r0 = r6._serverPendingApprovals     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r7 = r0.getValue()     // Catch: java.lang.Throwable -> Lab
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r7 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L19
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L19
            goto La9
        L19:
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> Lab
        L1d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> Lab
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = r0.approvalId     // Catch: java.lang.Throwable -> Lab
            r5 = r43
            java.lang.String r0 = r5.approvalId     // Catch: java.lang.Throwable -> Lab
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L1d
            X.BLG<java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval>> r3 = r6._serverPendingApprovals     // Catch: java.lang.Throwable -> Lab
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r7)     // Catch: java.lang.Throwable -> Lab
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lab
        L3f:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La6
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Lab
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r8 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r8     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = r8.approvalId     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r5.approvalId     // Catch: java.lang.Throwable -> Lab
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L9f
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRichPayload r0 = r8.richPayload     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La3
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRichPayload r38 = r6.withWalletSelection(r0, r5)     // Catch: java.lang.Throwable -> Lab
        L5d:
            r42 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r9 = 0
            r10 = 0
            r12 = 0
            r11 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r9
            r25 = r10
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r35 = r9
            r36 = r9
            r37 = r9
            r39 = r10
            r40 = r9
            r41 = r9
            r43 = r9
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r8 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval.copy$default(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch: java.lang.Throwable -> Lab
        L9f:
            r2.add(r8)     // Catch: java.lang.Throwable -> Lab
            goto L3f
        La3:
            r38 = 0
            goto L5d
        La6:
            X.AnonymousClass002.A1I(r3, r2)     // Catch: java.lang.Throwable -> Lab
        La9:
            monitor-exit(r4)
            return
        Lab:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.applyWalletSelection(com.facebook.aura.gateway.WalletSelectionResult):void");
    }

    private final ApprovalDecisionJson approvalDecisionJson(AgentPermissionApprovalDecision agentPermissionApprovalDecision) {
        return new ApprovalDecisionJson(agentPermissionApprovalDecision.approvalId, agentPermissionApprovalDecision.decisionKind, agentPermissionApprovalDecision.reason, agentPermissionApprovalDecision.alwaysScope, agentPermissionApprovalDecision.expectedMessageRevision);
    }

    private final boolean completeLocalApproval(String str, AgentPermissionDecision agentPermissionDecision) {
        LocalPendingApprovalRecord localPendingApprovalRecordRemove;
        synchronized (this.localPendingApprovalsLock) {
            localPendingApprovalRecordRemove = this.localPendingApprovalRecords.remove(str);
            if (localPendingApprovalRecordRemove != null) {
                publishLocalPendingApprovalsLocked();
            } else {
                localPendingApprovalRecordRemove = null;
            }
        }
        if (localPendingApprovalRecordRemove == null) {
            return false;
        }
        C3cG.A1F(localPendingApprovalRecordRemove.decision, agentPermissionDecision);
        return true;
    }

    public static /* synthetic */ Object decideApproval$default(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, String str, String str2, String str3, String str4, boolean z, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        return hatchAgentPermissionsRepository.decideApproval(str, str2, str3, str4, z, l, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decideServerApprovals(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> r13, X.HtJ<? super com.facebook.aura.gateway.HatchAgentPermissionsRepository.DecideResult> r14) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.decideServerApprovals(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchDeviceApprovalCopy(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, X.HtJ<? super com.facebook.aura.gateway.HatchAgentPermissionsRepository.DeviceApprovalCopy> r29) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.fetchDeviceApprovalCopy(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void finishDecide(Set<String> set, Set<String> set2) {
        this.decideReadGate.finish(set, set2);
        if (set2.isEmpty()) {
            return;
        }
        readAfterLostDecide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DecideResult mergeDecisionResults(DecideResult decideResult, DecideResult decideResult2) {
        return !(decideResult instanceof DecideResult.Failed) ? ((decideResult2 instanceof DecideResult.Failed) || (decideResult2 instanceof DecideResult.PartiallyApplied) || (decideResult2 instanceof DecideResult.Confirming)) ? decideResult2 : DecideResult.Success.INSTANCE : decideResult;
    }

    private final void publishLocalPendingApprovalsLocked() {
        BLG<List<AgentPermissionApproval>> blg = this._localPendingApprovals;
        Collection<LocalPendingApprovalRecord> collectionValues = this.localPendingApprovalRecords.values();
        C7384Etj.A0U(collectionValues);
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        Iterator<LocalPendingApprovalRecord> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().approval);
        }
        AnonymousClass002.A1I(blg, arrayListA0i);
    }

    private final void readAfterLostDecide() {
        SingleFlight singleFlight = this.recoverySingleFlight;
        Unit unit = Unit.INSTANCE;
        singleFlight.forget(unit);
        this.lostDecideReadWake.AhZ(unit);
        synchronized (this.lostDecideReadLock) {
            AnonymousClass003.A14(this._decisionConfirmationStalled, false);
            HoC hoC = this.lostDecideReadJob;
            if (hoC == null || !hoC.isActive()) {
                this.lostDecideReadJob = AnonymousClass001.A11(new HatchAgentPermissionsRepository$readAfterLostDecide$1$1(this, null), this.scope);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recoverPendingApprovals(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.C120341
            if (r0 == 0) goto L39
            r5 = r7
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$1 r5 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.C120341) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.recoverySingleFlight
            r0 = 0
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$2 r1 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$2
            r1.<init>(r0)
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r2.invoke(r0, r1, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$1 r5 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$recoverPendingApprovals$1
            r5.<init>(r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.recoverPendingApprovals(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        if (r12 <= r0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void replaceServerPendingApprovals(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r10, java.util.List<com.facebook.aura.gateway.ApprovalSnapshotRecordJson> r11, long r12, com.facebook.aura.gateway.SnapshotSource r14, java.lang.Long r15, java.lang.Long r16) {
        /*
            r9 = this;
            java.lang.Object r2 = r9.serverPendingApprovalsLock
            monitor-enter(r2)
            com.facebook.aura.gateway.SnapshotSource r6 = com.facebook.aura.gateway.SnapshotSource.HTTP_RECOVERY     // Catch: java.lang.Throwable -> Lc2
            if (r14 != r6) goto L15
            long r0 = r9.websocketSnapshotVersion     // Catch: java.lang.Throwable -> Lc2
            if (r16 == 0) goto Lc0
            long r4 = r16.longValue()     // Catch: java.lang.Throwable -> Lc2
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L15
            goto Lc0
        L15:
            r4 = 0
            if (r14 != r6) goto L25
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 > 0) goto L25
            long r0 = r9.lastAppliedSnapshotMs     // Catch: java.lang.Throwable -> Lc2
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L25
            goto Lc0
        L25:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 <= 0) goto L31
            long r0 = r9.lastAppliedSnapshotMs     // Catch: java.lang.Throwable -> Lc2
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L31
            goto Lbc
        L31:
            com.facebook.aura.gateway.SnapshotSource r3 = com.facebook.aura.gateway.SnapshotSource.WEBSOCKET     // Catch: java.lang.Throwable -> Lc2
            r6 = 1
            if (r14 != r3) goto L3c
            long r0 = r9.websocketSnapshotVersion     // Catch: java.lang.Throwable -> Lc2
            long r0 = r0 + r6
            r9.websocketSnapshotVersion = r0     // Catch: java.lang.Throwable -> Lc2
        L3c:
            java.util.LinkedHashSet r4 = X.C3cG.A0k()     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Throwable -> Lc2
        L44:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lc2
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = r0.approvalId     // Catch: java.lang.Throwable -> Lc2
            r4.add(r0)     // Catch: java.lang.Throwable -> Lc2
            goto L44
        L56:
            com.facebook.aura.gateway.ApprovalDecideReadGate r0 = r9.decideReadGate     // Catch: java.lang.Throwable -> Lc2
            boolean r8 = r0.onSnapshotApplied(r15, r4)     // Catch: java.lang.Throwable -> Lc2
            long r0 = r9.lastAppliedSnapshotMs     // Catch: java.lang.Throwable -> Lc2
            long r0 = java.lang.Math.max(r0, r12)     // Catch: java.lang.Throwable -> Lc2
            r9.lastAppliedSnapshotMs = r0     // Catch: java.lang.Throwable -> Lc2
            java.util.List<com.facebook.aura.gateway.ApprovalSnapshotRecordJson> r0 = r9.lastRecentApprovals     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = X.C7384Etj.areEqual(r11, r0)     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto L7c
            r9.lastRecentApprovals = r11     // Catch: java.lang.Throwable -> Lc2
            X.BLG<java.lang.Long> r5 = r9._historyRefreshVersion     // Catch: java.lang.Throwable -> Lc2
            long r0 = X.C3cH.A08(r5)     // Catch: java.lang.Throwable -> Lc2
            long r0 = r0 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lc2
            X.AnonymousClass002.A1I(r5, r0)     // Catch: java.lang.Throwable -> Lc2
        L7c:
            java.util.Set<java.lang.String> r0 = r9.resolvedServerApprovalIds     // Catch: java.lang.Throwable -> Lc2
            r0.retainAll(r4)     // Catch: java.lang.Throwable -> Lc2
            X.BLG<java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval>> r7 = r9._serverPendingApprovals     // Catch: java.lang.Throwable -> Lc2
            java.util.ArrayList r6 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> Lc2
        L8b:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto La6
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> Lc2
            r0 = r4
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0     // Catch: java.lang.Throwable -> Lc2
            java.util.Set<java.lang.String> r1 = r9.resolvedServerApprovalIds     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = r0.approvalId     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto L8b
            r6.add(r4)     // Catch: java.lang.Throwable -> Lc2
            goto L8b
        La6:
            X.C3cG.A0V(r7, r6)     // Catch: java.lang.Throwable -> Lc2
            X.BLG<java.lang.Boolean> r1 = r9._hasLoadedServerApprovals     // Catch: java.lang.Throwable -> Lc2
            r0 = 1
            X.AnonymousClass003.A14(r1, r0)     // Catch: java.lang.Throwable -> Lc2
            if (r14 != r3) goto Lba
            if (r8 == 0) goto Lba
        Lb3:
            monitor-exit(r2)
            if (r0 == 0) goto Lc1
            r9.readAfterLostDecide()
            return
        Lba:
            r0 = 0
            goto Lb3
        Lbc:
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 > 0) goto L31
        Lc0:
            monitor-exit(r2)
        Lc1:
            return
        Lc2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.replaceServerPendingApprovals(java.util.List, java.util.List, long, com.facebook.aura.gateway.SnapshotSource, java.lang.Long, java.lang.Long):void");
    }

    public static /* synthetic */ void replaceServerPendingApprovals$default(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, List list, List list2, long j, SnapshotSource snapshotSource, Long l, Long l2, int i, Object obj) {
        if ((i & 32) != 0) {
            l2 = null;
        }
        hatchAgentPermissionsRepository.replaceServerPendingApprovals(list, list2, j, snapshotSource, l, l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008a -> B:18:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009b -> B:12:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryReadUntilLostDecidesConfirmed(X.HtJ<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.retryReadUntilLostDecidesConfirmed(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[LOOP:0: B:13:0x0047->B:15:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1 A[LOOP:2: B:53:0x019b->B:55:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendServerDecisions(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> r35, X.HtJ<? super com.facebook.aura.gateway.ServerDecideAttempt> r36) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.sendServerDecisions(java.util.List, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object setWalletSelection$default(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, String str, String str2, String str3, String str4, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return hatchAgentPermissionsRepository.setWalletSelection(str, str2, str3, str4, z, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDecisionConfirmingToast() {
        ToastApi.INSTANCE.showToast(C3cG.A06().getString(R.string._name_removed__res_0x7f120a45));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDecisionFailureToast() {
        ToastApi.INSTANCE.showToast(C3cG.A06().getString(R.string._name_removed__res_0x7f120b19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HxE<List<AgentPermissionApprovalDecision>, List<AgentPermissionApprovalDecision>> splitLocalAndServerDecisions(List<AgentPermissionApprovalDecision> list) {
        Set setA0g;
        synchronized (this.localPendingApprovalsLock) {
            Set<String> setKeySet = this.localPendingApprovalRecords.keySet();
            C7384Etj.A0U(setKeySet);
            setA0g = AbstractC0878AGe.A0g(setKeySet);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (AgentPermissionApprovalDecision agentPermissionApprovalDecision : list) {
            if (setA0g.contains(agentPermissionApprovalDecision.approvalId)) {
                arrayListA0h.add(agentPermissionApprovalDecision);
            } else {
                arrayListA0h2.add(agentPermissionApprovalDecision);
            }
        }
        return C3cG.A0r(arrayListA0h, arrayListA0h2);
    }

    private final AgentPermissionRichPayload withWalletSelection(AgentPermissionRichPayload agentPermissionRichPayload, WalletSelectionResult walletSelectionResult) {
        AgentPermissionRichPayload agentPermissionRichPayloadCopy$default;
        if (agentPermissionRichPayload instanceof BrowserCheckoutApproval) {
            BrowserCheckoutApproval browserCheckoutApproval = (BrowserCheckoutApproval) agentPermissionRichPayload;
            CheckoutPaymentSelection paymentSelection = walletSelectionResult.paymentSelection;
            if (paymentSelection == null) {
                paymentSelection = browserCheckoutApproval.getPaymentSelection();
            }
            String str = walletSelectionResult.paymentMethodLabel;
            if (str == null) {
                str = browserCheckoutApproval.paymentMethodLabel;
            }
            String str2 = walletSelectionResult.cardBrand;
            if (str2 == null) {
                str2 = browserCheckoutApproval.cardBrand;
            }
            String str3 = walletSelectionResult.cardLast4;
            if (str3 == null) {
                str3 = browserCheckoutApproval.cardLast4;
            }
            agentPermissionRichPayloadCopy$default = BrowserCheckoutApproval.copy$default(browserCheckoutApproval, 0, null, str, str2, str3, null, null, null, null, null, null, paymentSelection, null, null, 14307, null);
        } else if (agentPermissionRichPayload instanceof ShopifyCheckoutApproval) {
            ShopifyCheckoutApproval shopifyCheckoutApproval = (ShopifyCheckoutApproval) agentPermissionRichPayload;
            CheckoutPaymentSelection paymentSelection2 = walletSelectionResult.paymentSelection;
            if (paymentSelection2 == null) {
                paymentSelection2 = shopifyCheckoutApproval.getPaymentSelection();
            }
            String str4 = walletSelectionResult.paymentMethodLabel;
            if (str4 == null) {
                str4 = shopifyCheckoutApproval.paymentMethodLabel;
            }
            String str5 = walletSelectionResult.cardBrand;
            if (str5 == null) {
                str5 = shopifyCheckoutApproval.cardBrand;
            }
            String str6 = walletSelectionResult.cardLast4;
            if (str6 == null) {
                str6 = shopifyCheckoutApproval.cardLast4;
            }
            agentPermissionRichPayloadCopy$default = ShopifyCheckoutApproval.copy$default(shopifyCheckoutApproval, 0, null, null, null, null, null, null, null, null, null, null, null, str4, str5, str6, paymentSelection2, null, null, null, 462847, null);
        } else if (agentPermissionRichPayload instanceof StripeLinkCheckoutApproval) {
            StripeLinkCheckoutApproval stripeLinkCheckoutApproval = (StripeLinkCheckoutApproval) agentPermissionRichPayload;
            CheckoutPaymentSelection paymentSelection3 = walletSelectionResult.paymentSelection;
            if (paymentSelection3 == null) {
                paymentSelection3 = stripeLinkCheckoutApproval.getPaymentSelection();
            }
            String str7 = walletSelectionResult.paymentMethodLabel;
            if (str7 == null) {
                str7 = stripeLinkCheckoutApproval.paymentMethodLabel;
            }
            String str8 = walletSelectionResult.cardBrand;
            if (str8 == null) {
                str8 = stripeLinkCheckoutApproval.cardBrand;
            }
            String str9 = walletSelectionResult.cardLast4;
            if (str9 == null) {
                str9 = stripeLinkCheckoutApproval.cardLast4;
            }
            agentPermissionRichPayloadCopy$default = stripeLinkCheckoutApproval.copy(stripeLinkCheckoutApproval.version, stripeLinkCheckoutApproval.merchantUrl, stripeLinkCheckoutApproval.amount, stripeLinkCheckoutApproval.currency, str7, str8, str9, stripeLinkCheckoutApproval.cardExpiresInMs, paymentSelection3, stripeLinkCheckoutApproval.paymentOptions);
        } else if (agentPermissionRichPayload instanceof ReservationCheckoutApproval) {
            ReservationCheckoutApproval reservationCheckoutApproval = (ReservationCheckoutApproval) agentPermissionRichPayload;
            CheckoutPaymentSelection paymentSelection4 = walletSelectionResult.paymentSelection;
            if (paymentSelection4 == null) {
                paymentSelection4 = reservationCheckoutApproval.getPaymentSelection();
            }
            String str10 = walletSelectionResult.paymentMethodLabel;
            if (str10 == null) {
                str10 = reservationCheckoutApproval.paymentMethodLabel;
            }
            String str11 = walletSelectionResult.cardBrand;
            if (str11 == null) {
                str11 = reservationCheckoutApproval.cardBrand;
            }
            String str12 = walletSelectionResult.cardLast4;
            if (str12 == null) {
                str12 = reservationCheckoutApproval.cardLast4;
            }
            agentPermissionRichPayloadCopy$default = ReservationCheckoutApproval.copy$default(reservationCheckoutApproval, 0, null, null, null, null, null, null, false, false, null, str10, str11, str12, paymentSelection4, null, 17407, null);
        } else {
            if (!(agentPermissionRichPayload instanceof FlightCheckoutApproval)) {
                return agentPermissionRichPayload;
            }
            FlightCheckoutApproval flightCheckoutApproval = (FlightCheckoutApproval) agentPermissionRichPayload;
            CheckoutPaymentSelection paymentSelection5 = walletSelectionResult.paymentSelection;
            if (paymentSelection5 == null) {
                paymentSelection5 = flightCheckoutApproval.getPaymentSelection();
            }
            String str13 = walletSelectionResult.paymentMethodLabel;
            if (str13 == null) {
                str13 = flightCheckoutApproval.paymentMethodLabel;
            }
            String str14 = walletSelectionResult.cardBrand;
            if (str14 == null) {
                str14 = flightCheckoutApproval.cardBrand;
            }
            String str15 = walletSelectionResult.cardLast4;
            if (str15 == null) {
                str15 = flightCheckoutApproval.cardLast4;
            }
            String str16 = str13;
            agentPermissionRichPayloadCopy$default = FlightCheckoutApproval.copy$default(flightCheckoutApproval, 0, null, null, null, null, null, null, null, null, null, null, str16, str14, str15, paymentSelection5, null, 34815, null);
        }
        return agentPermissionRichPayloadCopy$default;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        HoC hoC = this.observationJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.observationJob = null;
        synchronized (this.localPendingApprovalsLock) {
            Collection<LocalPendingApprovalRecord> collectionValues = this.localPendingApprovalRecords.values();
            C7384Etj.A0U(collectionValues);
            Iterator<LocalPendingApprovalRecord> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((GAt) it.next().decision).A0R(AgentPermissionDecision.DENY);
            }
            this.localPendingApprovalRecords.clear();
            publishLocalPendingApprovalsLocked();
        }
        synchronized (this.serverPendingApprovalsLock) {
            BLG<List<AgentPermissionApproval>> blg = this._serverPendingApprovals;
            C0881AGi c0881AGi = C0881AGi.A00;
            blg.Af8(c0881AGi);
            this.lastAppliedSnapshotMs = 0L;
            this.websocketSnapshotVersion = 0L;
            this.lastRecentApprovals = c0881AGi;
            AnonymousClass001.A1E(this._historyRefreshVersion, null, 0L);
            this.resolvedServerApprovalIds.clear();
        }
        synchronized (this.walletSelectionsLock) {
            this.walletSelectionsInFlight.clear();
        }
        this.decideReadGate.clear();
        this.recoverySingleFlight.clearAndCancelAll();
        Hxb.A03(null, this.scope);
    }

    public final List<AgentPermissionApproval> currentPendingApprovals() {
        return AbstractC0878AGe.A0P(this._serverPendingApprovals.getValue(), this._localPendingApprovals.getValue());
    }

    public final Object decideApproval(String str, String str2, String str3, String str4, boolean z, Long l, HtJ<? super DecideResult> htJ) {
        return decideApprovals(Collections.singletonList(new AgentPermissionApprovalDecision(str, str2, str3, str4, l)), z, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* renamed from: fetchEditableMessage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m951fetchEditableMessagegIAlus(java.lang.String r6, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.EditableMessageEditor>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchEditableMessage$1
            if (r0 == 0) goto L33
            r4 = r7
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchEditableMessage$1 r4 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchEditableMessage$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L39
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L21:
            return r0
        L22:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchApprovalMessageEditor r1 = r5.messageEditor
            r0 = 0
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r0 = r1.m953fetchgIAlus(r6, r4)
            if (r0 != r3) goto L21
            return r3
        L33:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchEditableMessage$1 r4 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchEditableMessage$1
            r4.<init>(r5, r7)
            goto L12
        L39:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.m951fetchEditableMessagegIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C1BN<Set<String>> getConfirmingApprovalIds() {
        return this.confirmingApprovalIds;
    }

    public final C1BN<Boolean> getDecisionConfirmationStalled() {
        return this.decisionConfirmationStalled;
    }

    public final C1BN<Boolean> getHasLoadedServerApprovals() {
        return this.hasLoadedServerApprovals;
    }

    public final C1BN<Long> getHistoryRefreshVersion() {
        return this.historyRefreshVersion;
    }

    public final C1BN<List<AgentPermissionApproval>> getPendingApprovals() {
        return this.pendingApprovals;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #1 {, blocks: (B:31:0x0078, B:33:0x0084, B:35:0x0088, B:41:0x0098, B:43:0x00a4, B:45:0x00a8, B:19:0x0041, B:21:0x004d, B:23:0x0051, B:24:0x0058), top: B:53:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #1 {, blocks: (B:31:0x0078, B:33:0x0084, B:35:0x0088, B:41:0x0098, B:43:0x00a4, B:45:0x00a8, B:19:0x0041, B:21:0x004d, B:23:0x0051, B:24:0x0058), top: B:53:0x0041 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.GAt, X.GBM, X.Hsz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestLocalApproval(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r10, X.HtJ<? super com.facebook.aura.gateway.AgentPermissionDecision> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.C120361
            if (r0 == 0) goto L25
            r7 = r11
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$requestLocalApproval$1 r7 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.C120361) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L36
            if (r0 != r6) goto L31
            java.lang.Object r5 = r7.L$1
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r10 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r10
            goto L2b
        L25:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$requestLocalApproval$1 r7 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$requestLocalApproval$1
            r7.<init>(r11)
            goto L12
        L2b:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L2f:
            r2 = move-exception
            goto L95
        L31:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L36:
            X.Hwg.A00(r2)
            X.GAt r5 = new X.GAt
            r5.<init>(r3)
            java.lang.Object r4 = r9.localPendingApprovalsLock
            monitor-enter(r4)
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.LocalPendingApprovalRecord> r1 = r9.localPendingApprovalRecords     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r10.approvalId     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.aura.gateway.LocalPendingApprovalRecord r0 = (com.facebook.aura.gateway.LocalPendingApprovalRecord) r0     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L58
            X.Hsz<com.facebook.aura.gateway.AgentPermissionDecision> r1 = r0.decision     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L58
            com.facebook.aura.gateway.AgentPermissionDecision r0 = com.facebook.aura.gateway.AgentPermissionDecision.DENY     // Catch: java.lang.Throwable -> Lb4
            X.GAt r1 = (X.GAt) r1     // Catch: java.lang.Throwable -> Lb4
            r1.A0R(r0)     // Catch: java.lang.Throwable -> Lb4
        L58:
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.LocalPendingApprovalRecord> r2 = r9.localPendingApprovalRecords     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r10.approvalId     // Catch: java.lang.Throwable -> Lb4
            com.facebook.aura.gateway.LocalPendingApprovalRecord r0 = new com.facebook.aura.gateway.LocalPendingApprovalRecord     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r10, r5)     // Catch: java.lang.Throwable -> Lb4
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lb4
            r9.publishLocalPendingApprovalsLocked()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r4)
            r7.L$0 = r10     // Catch: java.lang.Throwable -> L94
            r7.L$1 = r5     // Catch: java.lang.Throwable -> L94
            r7.label = r6     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r5.A0E(r7)     // Catch: java.lang.Throwable -> L94
            if (r2 != r8) goto L75
            return r8
        L75:
            java.lang.Object r4 = r9.localPendingApprovalsLock
            monitor-enter(r4)
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.LocalPendingApprovalRecord> r1 = r9.localPendingApprovalRecords     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r10.approvalId     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.aura.gateway.LocalPendingApprovalRecord r0 = (com.facebook.aura.gateway.LocalPendingApprovalRecord) r0     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L86
            X.Hsz<com.facebook.aura.gateway.AgentPermissionDecision> r3 = r0.decision     // Catch: java.lang.Throwable -> Lb4
        L86:
            if (r3 != r5) goto L92
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.LocalPendingApprovalRecord> r1 = r9.localPendingApprovalRecords     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r10.approvalId     // Catch: java.lang.Throwable -> Lb4
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lb4
            r9.publishLocalPendingApprovalsLocked()     // Catch: java.lang.Throwable -> Lb4
        L92:
            monitor-exit(r4)
            return r2
        L94:
            r2 = move-exception
        L95:
            java.lang.Object r4 = r9.localPendingApprovalsLock
            monitor-enter(r4)
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.LocalPendingApprovalRecord> r1 = r9.localPendingApprovalRecords     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r10.approvalId     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.aura.gateway.LocalPendingApprovalRecord r0 = (com.facebook.aura.gateway.LocalPendingApprovalRecord) r0     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto La6
            X.Hsz<com.facebook.aura.gateway.AgentPermissionDecision> r3 = r0.decision     // Catch: java.lang.Throwable -> Lb4
        La6:
            if (r3 != r5) goto Lb2
            java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.LocalPendingApprovalRecord> r1 = r9.localPendingApprovalRecords     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r10.approvalId     // Catch: java.lang.Throwable -> Lb4
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lb4
            r9.publishLocalPendingApprovalsLocked()     // Catch: java.lang.Throwable -> Lb4
        Lb2:
            monitor-exit(r4)
            throw r2
        Lb4:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.requestLocalApproval(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* renamed from: saveEditableMessage-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m952saveEditableMessagebMdYcbs(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List<java.lang.String> r16, long r17, java.lang.String r19, X.HtJ<? super X.HsJ<kotlin.Unit>> r20) {
        /*
            r12 = this;
            r3 = r20
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$1
            if (r0 == 0) goto L59
            r11 = r3
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$1 r11 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r11.label = r2
        L14:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L5f
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)
        L23:
            boolean r0 = r3 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L34
            X.3UX r2 = r12.scope
            r1 = 0
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$2$1 r0 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$2$1
            r0.<init>(r12, r1)
            X.AnonymousClass001.A1J(r0, r2)
        L34:
            return r3
        L35:
            X.Hwg.A00(r3)
            com.facebook.aura.gateway.HatchApprovalMessageEditor r3 = r12.messageEditor
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r0
            r11.L$3 = r0
            r11.L$4 = r0
            r8 = r17
            r11.J$0 = r8
            r11.label = r1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r10 = r19
            java.lang.Object r3 = r3.m954savebMdYcbs(r4, r5, r6, r7, r8, r10, r11)
            if (r3 != r2) goto L23
            return r2
        L59:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$1 r11 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$saveEditableMessage$1
            r11.<init>(r12, r3)
            goto L14
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepository.m952saveEditableMessagebMdYcbs(java.lang.String, java.lang.String, java.lang.String, java.util.List, long, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchAgentPermissionsRepository createForTest$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return new HatchAgentPermissionsRepository(abstractC3358CGz);
        }

        public final HatchAgentPermissionsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAgentPermissionsRepository) abstractC3358CGz.A03(HatchAgentPermissionsRepository.class, new HatchAgentPermissionsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAgentPermissionsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HzC hzCA0x = C3cH.A0x(AnonymousClass001.A0y());
        this.scope = hzCA0x;
        this.messageEditor = new HatchApprovalMessageEditor(abstractC3358CGz);
        C0881AGi c0881AGi = C0881AGi.A00;
        C9286GCn c9286GCnA01 = HnJ.A01(c0881AGi);
        this._localPendingApprovals = c9286GCnA01;
        C9286GCn c9286GCnA012 = HnJ.A01(c0881AGi);
        this._serverPendingApprovals = c9286GCnA012;
        this.pendingApprovals = AnonymousClass441.A00(c0881AGi, hzCA0x, C3rb.A03(new HatchAgentPermissionsRepository$pendingApprovals$1(null), c9286GCnA01, c9286GCnA012), C3Ek.A00);
        C9286GCn c9286GCnA14 = C3cG.A14(0L);
        this._historyRefreshVersion = c9286GCnA14;
        this.historyRefreshVersion = c9286GCnA14;
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn c9286GCnA142 = C3cG.A14(boolA0h);
        this._hasLoadedServerApprovals = c9286GCnA142;
        this.hasLoadedServerApprovals = c9286GCnA142;
        this.localPendingApprovalsLock = C3cG.A0T();
        this.localPendingApprovalRecords = C3cG.A0j();
        this.serverPendingApprovalsLock = C3cG.A0T();
        this.lastRecentApprovals = c0881AGi;
        this.resolvedServerApprovalIds = C3cG.A0k();
        this.recoverySingleFlight = C3cH.A0M();
        ApprovalDecideReadGate approvalDecideReadGate = new ApprovalDecideReadGate();
        this.decideReadGate = approvalDecideReadGate;
        this.lostDecideReadLock = C3cG.A0T();
        this.lostDecideReadWake = AbstractC10623Hzj.A00(C79.A00, -1);
        this.confirmingApprovalIds = approvalDecideReadGate.blockedIds;
        C9286GCn c9286GCnA143 = C3cG.A14(boolA0h);
        this._decisionConfirmationStalled = c9286GCnA143;
        this.decisionConfirmationStalled = C3cG.A11(c9286GCnA143);
        this.walletSelectionsLock = C3cG.A0T();
        this.walletSelectionsInFlight = C3cG.A0k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DecideResult decideLocalApprovals(List<AgentPermissionApprovalDecision> list) {
        DecideResult failed;
        Iterator<AgentPermissionApprovalDecision> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                failed = DecideResult.Success.INSTANCE;
                break;
            }
            AgentPermissionApprovalDecision next = it.next();
            AgentPermissionDecision agentPermissionDecisionFromWire = AgentPermissionDecision.Companion.fromWire(next.decisionKind);
            if (agentPermissionDecisionFromWire == null) {
                failed = new DecideResult.Failed("Invalid local approval decision");
                break;
            }
            completeLocalApproval(next.approvalId, agentPermissionDecisionFromWire);
        }
        return failed;
    }

    private final DecideResult withRefused(DecideResult decideResult, Set<String> set) {
        DecideResult partiallyApplied;
        if (set.isEmpty()) {
            return decideResult;
        }
        if (decideResult instanceof DecideResult.Success) {
            return new DecideResult.Confirming(set);
        }
        if (decideResult instanceof DecideResult.Confirming) {
            partiallyApplied = new DecideResult.Confirming(BGK.A01(set, ((DecideResult.Confirming) decideResult).approvalIds));
        } else {
            if (!(decideResult instanceof DecideResult.PartiallyApplied)) {
                if (decideResult instanceof DecideResult.Failed) {
                    return decideResult;
                }
                throw C3cG.A0q();
            }
            partiallyApplied = new DecideResult.PartiallyApplied(BGK.A01(set, ((DecideResult.PartiallyApplied) decideResult).unappliedApprovalIds));
        }
        return partiallyApplied;
    }

    public final Object decideApprovals(List<AgentPermissionApprovalDecision> list, boolean z, HtJ<? super DecideResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(list, z, null));
    }

    public final Object refreshApprovals(HtJ<? super Unit> htJ) {
        return C3cG.A0U(recoverPendingApprovals(htJ));
    }

    public final void requestDecisionConfirmation() {
        readAfterLostDecide();
    }

    public final Object setWalletSelection(String str, String str2, String str3, String str4, boolean z, HtJ<? super DecideResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C120392(str, str2, str3, str4, z, null));
    }

    public final void start() {
        if (C9X.A04()) {
            return;
        }
        HoC hoC = this.observationJob;
        if (hoC == null || !hoC.isActive()) {
            HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(this.userSession);
            this.observationJob = AnonymousClass001.A11(new C120401(companion, this, null), this.scope);
        }
    }

    public /* synthetic */ HatchAgentPermissionsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
