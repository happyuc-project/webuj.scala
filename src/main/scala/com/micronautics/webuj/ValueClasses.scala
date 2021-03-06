package com.micronautics.webuj

import java.math.BigInteger
import org.webuj.protocol.core.methods.response.HucCompileSolidity

case class Address(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class Compiler(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class Digest(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

// @see See [[https://github.com/happyuc-project/wiki/wiki/Hucash Hucash]] for proof of work
case class EtHash(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class BlockHash(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class FilterId(value: BigInteger) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class LLLCompiled(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class LLLSource(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

/** An account nonce is a transaction counter, provided by HappyUC for each Account.
  * Nonces prevent replay attacks wherein a transaction sending Huc from A to B can be replayed by B over and over to
  * continually drain A's balance.
  * @see See [[https://github.com/happyuc-project/wiki/wiki/Glossary Glossary]] */
case class Nonce(value: BigInt) extends AnyVal {
  @inline def bigInteger: BigInteger = value.bigInteger

  @inline override def toString: String = value.toString
}

case class SerpentCompiled(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class SerpentSource(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

/** The SHA3 hash is more properly referred to as
  * [[https://happyuc.stackexchange.com/questions/550/which-cryptographic-hash-function-does-happyuc-use Keccak-256]] */
// todo better to use value classes to indicate functionality, not how something was created. Delete this type and replace by one of the others, or rename this
case class Keccak256Hash(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class Signature(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class SignedData(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

/** WebuJ already has [[HucCompileSolidity.Code]] to represent Solidity compiled code */
case class SoliditySource(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}

case class TransactionHash(value: String) extends AnyVal {
  @inline override def toString: String = value.toString
}
