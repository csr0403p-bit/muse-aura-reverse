package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWT {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWT[] A01;
    public static final BWT A02;
    public final String url;

    static {
        BWT bwt = new BWT(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, "");
        BWT bwt2 = new BWT("X_GRAPH_FACEBOOK_GRAPHQL_URL", 1, "https://graph-www.facebook.com/graphql");
        BWT bwt3 = new BWT("X_GRAPH_FACEBOOK_ZERO_RATING_BOOTSTRAP_URL", 2, "https://b-graph.facebook.com/graphql");
        BWT bwt4 = new BWT("X_GRAPH_OCULUS_GRAPHQL_URL", 3, "https://graph.oculus.com/graphql");
        BWT bwt5 = new BWT("X_GRAPH_PAYMENTS_GRAPHQL_URL", 4, "https://payments-graph.facebook.com/graphql");
        BWT bwt6 = new BWT("X_GRAPH_FACEBOOK_GENAI_GRAPHQL_URL", 5, "https://genai-graph.facebook.com/graphql");
        BWT bwt7 = new BWT("X_GRAPH_FACEBOOK_THREADS_GRAPHQL_URL", 6, "https://threads-graph.facebook.com/graphql");
        BWT bwt8 = new BWT("X_GRAPH_INSTAGRAM_GENAI_GRAPHQL_URL", 7, "https://genai-graph.instagram.com/graphql_www");
        BWT bwt9 = new BWT("X_GRAPH_INSTAGRAM_PAYMENTS_GRAPHQL_URL", 8, "https://payments-graph.instagram.com/graphql_www");
        BWT bwt10 = new BWT("X_GRAPH_META_PAYMENTS_GRAPHQL_URL", 9, "https://payments-graph.graph.meta.com/graphql");
        A02 = bwt10;
        BWT[] bwtArr = {bwt, bwt2, bwt3, bwt4, bwt5, bwt6, bwt7, bwt8, bwt9, bwt10, new BWT("X_GRAPH_OCULUS_PAYMENTS_GRAPHQL_URL", 10, "https://payments-graph.oculus.com/graphql"), new BWT("X_GRAPH_WHATSAPP_PAYMENTS_GRAPHQL_URL", 11, "https://payments-graph.whatsapp.com/graphql")};
        A01 = bwtArr;
        A00 = C3cG.A0w(bwtArr);
    }

    public static BWT valueOf(String str) {
        return (BWT) Enum.valueOf(BWT.class, str);
    }

    public static BWT[] values() {
        return (BWT[]) A01.clone();
    }

    public BWT(String str, int i, String str2) {
        this.url = str2;
    }
}
