package com.sysiq.commerce.akka.api

object RegistriesAPI {
  case class CommandRegistryEntryV(key: String, interfaceName: String, className: String, storeId: Int)
  case object Command
  case object RegistriesList
  case class CommandResponse(cache: scala.collection.mutable.Map[String, CommandRegistryEntryV])
  case class Execute(script: String)
  case class ExecutionResult(result: Any)
}