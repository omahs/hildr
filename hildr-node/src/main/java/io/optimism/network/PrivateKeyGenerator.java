/*
 * Copyright ConsenSys Software Inc., 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.optimism.network;

import io.libp2p.core.crypto.KEY_TYPE;
import io.libp2p.core.crypto.KeyKt;
import io.libp2p.core.crypto.PrivKey;

/**
 * The type PrivateKeyGenerator.
 *
 * @author grapebaba
 * @since 0.1.1
 */
public class PrivateKeyGenerator {
  /** Instantiates a new Private key generator. */
  public PrivateKeyGenerator() {}

  /**
   * Generate priv key.
   *
   * @return the priv key
   */
  public static PrivKey generate() {
    return KeyKt.generateKeyPair(KEY_TYPE.SECP256K1).component1();
  }
}
