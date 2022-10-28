
module Lib (
    someFunc
) where

--import Control.Monad.Writer

someFunc :: IO ()
someFunc = putStrLn "someFunc"

f :: Int -> Int
f x = x + 1
