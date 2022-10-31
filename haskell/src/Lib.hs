
module Lib (
    someFunc
) where

--import Control.Monad.Writer

someFunc :: IO ()
someFunc = putStrLn "someFunc"

f :: a -> a
f x = x
