package com.facebook.common.json;

import X.AbstractC10521Hoo;
import X.AbstractC9779GgG;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.F60;
import android.util.Base64;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.staticcontext.StaticGraphServiceFactory;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class TreeFragmentModelBase64Deserializer extends FbJsonDeserializer {
    public Class<Tree> A00;

    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        try {
            String strA27 = abstractC9916Gl7.A27();
            if (strA27 == null) {
                return null;
            }
            AbstractC10521Hoo.A00(strA27);
            if (strA27.startsWith("type_tag:")) {
                strA27 = strA27.substring(18);
            }
            ByteBuffer.wrap(Base64.decode(strA27, 2));
            StaticGraphServiceFactory.getTreeSerializer();
            throw null;
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            AbstractC9779GgG.A00(abstractC9916Gl7, this.A00, e);
            throw F60.createAndThrow();
        }
    }
}
